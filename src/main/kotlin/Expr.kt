import kotlin.collections.List

abstract class Expr {
	interface Visitor<out R> {
		fun visitBinaryExpr(expr : Binary) : R;
		fun visitGroupingExpr(expr : Grouping) : R;
		fun visitLiteralExpr(expr : Literal) : R;
		fun visitUnaryExpr(expr : Unary) : R;
}


	// generic function for double dispatch
	abstract fun <R> accept(visitor: Visitor<R>): R

	class Binary(
		left : Expr,
		operator : Token,
		right : Expr,
	) : Expr(){

		override fun <R> accept(visitor: Visitor<R>): R {
			return visitor.visitBinaryExpr(this);
}
		}

	class Grouping(
		expression : Expr,
	) : Expr(){

		override fun <R> accept(visitor: Visitor<R>): R {
			return visitor.visitGroupingExpr(this);
}
		}

	class Literal(
		value : Object,
	) : Expr(){

		override fun <R> accept(visitor: Visitor<R>): R {
			return visitor.visitLiteralExpr(this);
}
		}

	class Unary(
		operator : Token,
		right : Expr,
	) : Expr(){

		override fun <R> accept(visitor: Visitor<R>): R {
			return visitor.visitUnaryExpr(this);
}
		}

}

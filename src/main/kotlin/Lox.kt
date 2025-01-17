import java.io.File
import Scanner

class Lox() {
	fun interpret(script: String): Int {
		val scanner = Scanner(script)
		val tokens = scanner.scanTokens()

		for(token in tokens) {
			println(token)
		}
	
		return tokens.size
	}

	fun error(token: Token, message: String) {
		if(token.type == TokenType.EOF) {
			println(token.line.toString() + " at end" + message)
		} else {
			println(token.line.toString() + " at '" + token.lexeme + "'" + message)
		}
	}
}

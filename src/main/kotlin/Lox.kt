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
}

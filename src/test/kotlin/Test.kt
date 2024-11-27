import Lox
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class SampleTest {

    private val testLox: Lox = Lox()

    @Test
    fun testSum() {
        val expected = 42
        assertEquals(expected, testLox.interpret("40+2"))
    }

    @Test
    fun testWhitespaceSum() {
        val expected = 42
        assertEquals(expected, testLox.interpret("  40	+\n 2	"))
    }

    @Test
    fun testComment() {
        val expected = 20
        assertEquals(expected, testLox.interpret("// abc\n1+19"))
	}
}

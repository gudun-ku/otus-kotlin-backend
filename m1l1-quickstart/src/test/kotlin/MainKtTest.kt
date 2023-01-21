import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import ru.otus.otuskotlin.marketplace.m1l1.main
import kotlin.test.Test
import kotlin.test.assertEquals

internal class MainKtTest {

    @Test
    fun main_test() {
        val output = tapSystemOut {
            main()
        }

        assertEquals(
            "Module 1 says Hello, World!",
            output.trim()
        )
    }
}
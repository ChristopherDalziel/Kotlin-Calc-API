package to.dev.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


class MainAppTest {
    @Test
    fun`Given value a and value b, When ADD is called, Then a combination of the two values should be returned`() {
       val result = CalculatorComponent().add(10.00, 10.00)
        assertThat(result).isEqualTo(10.00 + 10.00)
    }
}
package to.dev.example

import io.dropwizard.Configuration

fun main(args: Array<String>) {
    println("Hello World")
}

class CalculatorConfig(val name: String = "unknown") : Configuration()
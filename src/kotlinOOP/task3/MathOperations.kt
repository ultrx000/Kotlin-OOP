package kotlinOOP.task3

class MathOperations {
    private fun add(a: Any, b: Any){
        if (a is Int && b is Int) {
            val c = (a + b).toDouble()
            println(c)
        }
        else if (a is Double && b is Double) {
            val c = a + b
            println(c)
        } else {
            println("Некорректное число")
        }
    }

    private fun subtract(a: Any, b: Any){
        if (a is Int && b is Int) {
            val c = (a - b).toDouble()
            println(c)
        }
        else if (a is Double && b is Double) {
            val c = a - b
            println(c)
        } else {
            println("Некорректное число")
        }
    }

    private fun multiply(a: Any, b: Any){
        if (a is Int && b is Int) {
            val c = (a * b).toDouble()
            println(c)
        }
        else if (a is Double && b is Double) {
            val c = a * b
            println(c)
        } else {
            println("Некорректное число")
        }
    }

    private fun divide(a: Any, b: Any){
        if (a is Int && b is Int) {
            val c = (a / b).toDouble()
            println(c)
        }
        else if (a is Double && b is Double) {
            val c = a / b
            println(c)
        } else {
            println("Некорректное число")
        }
    }

    fun menu() {
        println("введите первое число")
        val a = readln().toDouble()

        println("введите второе число")
        val b = readln().toDouble()

        println("+, -, *, /")
        val operation = readln()

        val mathOperations = MathOperations()

        when (operation) {
            "+" -> add(a , b)
            "-" -> subtract(a, b)
            "*" -> multiply(a, b)
            "/" -> divide(a, b)
            else -> println("Некорректная операция")
        }

    }
}
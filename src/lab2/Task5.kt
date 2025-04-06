package lab2

/**
 * Author: rvita
 * Date: 06.04.2025
 */
fun arithmeticException() {
    try {
        val a = readln().toInt()
        val b = readln().toInt()

        val result = a / b
        println(result)
    } catch (e: ArithmeticException) {
        println("Ділення на нуль, будь ласка, виправте другий аргумент!")
    }
}

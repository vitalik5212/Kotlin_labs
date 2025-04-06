package lab2

/**
 * Author: rvita
 * Date: 06.04.2025
 */
fun calculateBreakingDistance() {
    val v1Input = readln()
    val aInput = readln()

    try {
        val v1 = v1Input.toInt()
        val a = aInput.toInt()

        val s = -(v1 * v1) / (2 * a)
        println(s)
    } catch (e: ArithmeticException) {
        println("Aвтомобіль не сповільнюється!")
        println(-1)
    } catch (e: Exception) {
        println(e.message)
        println(-1)
    }
}

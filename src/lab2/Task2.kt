package lab2

/**
 * Author: rvita
 * Date: 06.04.2025
 */
fun listAndLoop() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()

    repeat(n) {
        list.add(readln().toInt())
    }

    val k = readln().toInt() % n

    val rotated = list.takeLast(k) + list.dropLast(k)

    println(rotated.joinToString(" "))
}

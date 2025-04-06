package lab2

/**
 * Author: rvita
 * Date: 06.04.2025
 */
fun matrixCorners() {
    val rows = readln().toInt()
    val matrix = mutableListOf<List<Int>>()

    repeat(rows) {
        val row = readln().split(" ").map { it.toInt() }
        matrix.add(row)
    }

    val topLeft = matrix.first().first()
    val topRight = matrix.first().last()
    val bottomLeft = matrix.last().first()
    val bottomRight = matrix.last().last()

    println("$topLeft $topRight")
    println("$bottomLeft $bottomRight")
}

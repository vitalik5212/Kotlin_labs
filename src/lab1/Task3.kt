package lab1

import kotlin.math.sqrt

/**
 * Author: Vitalii Skuratovskyi
 * Date: 06.04.2025
 */
fun calculateRoomSquare() {
    val pi = 3.14
    println("Input room type: [triangle, rectangle, circle]:")
    val type = readln()

    val area = when (type) {
        "triangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            val c = readln().toDouble()
            val s = (a + b + c) / 2
            sqrt(s * (s - a) * (s - b) * (s - c))
        }
        "rectangle" -> {
            val a = readln().toDouble()
            val b = readln().toDouble()
            a * b
        }
        "circle" -> {
            val r = readln().toDouble()
            pi * r * r
        }
        else -> {
            println("Incorrect room type, use one option from provided: [triangle, rectangle, circle]")
            return
        }
    }

    println(area)
}

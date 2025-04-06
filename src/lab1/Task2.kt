package lab1

/**
 * Author: Vitalii Skuratovskyi
 * Date: 06.04.2025
 */
fun readName() {
    val input = readln()
    val parts = input.split(" ")

    if (parts.size != 3) {
        throw Exception("Incorrect input String. The input data should follow the next format: \"[firstName] [lastName] [Age]\"")
    }

    val name = parts[0]
    val surname = parts[1]
    val age = parts[2].toInt()

    val initial = name.first().uppercase()
    println("$initial. $surname, $age років.")
}

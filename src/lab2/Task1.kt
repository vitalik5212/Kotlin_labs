package lab2

/**
 * Author: rvita
 * Date: 06.04.2025
 */
fun numberSequence() {
    print("Enter the number of sequence elements to print:\n> ")
    val n = readln().toInt()

    var count = 0
    var current = 1

    while (count < n) {
        var repeat = 0
        while (repeat < current && count < n) {
            print("$current ")
            repeat++
            count++
        }
        current++
    }
    println()
}

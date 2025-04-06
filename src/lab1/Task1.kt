package lab1

/**
 * Author: Vitalii Skuratovskyi
 * Date: 06.04.2025
 */
fun countNumbers(a: Int, b: Int): Int {
    var result = 0

    for (i in a..b) {
        result += i
    }
    return result
}

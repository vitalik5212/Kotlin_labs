package lab1

/**
 * Author: Vitalii Skuratovskyi
 * Date: 06.04.2025
 */
fun runStringProcessor() {
    println("Input 2 strings and operation from provided: [equals, plus, endsWith]:")

    val s1 = readln()
    val s2 = readln()

    while (true) {
        val operation = readln()

        when (operation) {
            "equals" -> {
                println((s1 == s2).toString())
                break
            }
            "plus" -> {
                println(s1 + s2)
                break
            }
            "endsWith" -> {
                println(s1.endsWith(s2).toString())
                break
            }
            else -> {
                println("Incorrect operation")
            }
        }
    }
}

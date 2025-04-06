package lab2

/**
 * Author: Vitalii Skuratovskyi
 * Date: 06.04.2025
 */
class CoffeeMachine(
    private var water: Int,
    private var milk: Int,
    private var coffeeBeans: Int,
    private var cups: Int,
    private var money: Int
) {

    fun start() {
        while (true) {
            print("Write action (buy, fill, take, remaining, exit):\n> ")
            when (readln()) {
                "buy" -> buy()
                "fill" -> fill()
                "take" -> take()
                "remaining" -> printState()
                "exit" -> {
                    println("Coffee machine turned off.")
                    break
                }
                else -> println("Unknown action. Try again.")
            }
        }
    }

    private fun buy() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n> ")
        when (val choice = readln()) {
            "1" -> makeCoffee(250, 0, 16, 4)
            "2" -> makeCoffee(350, 75, 20, 7)
            "3" -> makeCoffee(200, 100, 12, 6)
            "back" -> return
            else -> println("Unknown coffee type.")
        }
    }

    private fun makeCoffee(requiredWater: Int, requiredMilk: Int, requiredBeans: Int, price: Int) {
        val missing = when {
            water < requiredWater -> "water"
            milk < requiredMilk -> "milk"
            coffeeBeans < requiredBeans -> "coffee beans"
            cups < 1 -> "disposable cups"
            else -> null
        }

        if (missing != null) {
            println("Sorry, not enough $missing!")
            return
        }

        water -= requiredWater
        milk -= requiredMilk
        coffeeBeans -= requiredBeans
        cups -= 1
        money += price

        println("I have enough resources, making you a coffee!")
    }

    private fun fill() {
        print("Write how many ml of water you want to add:\n> ")
        water += readln().toInt()
        print("Write how many ml of milk you want to add:\n> ")
        milk += readln().toInt()
        print("Write how many grams of coffee beans you want to add:\n> ")
        coffeeBeans += readln().toInt()
        print("Write how many disposable cups you want to add:\n> ")
        cups += readln().toInt()
    }

    private fun take() {
        println("I gave you \$$money")
        money = 0
    }

    private fun printState() {
        println("\nThe coffee machine has:")
        println("$water ml of water")
        println("$milk ml of milk")
        println("$coffeeBeans g of coffee beans")
        println("$cups disposable cups")
        println("$$money of money\n")
    }
}

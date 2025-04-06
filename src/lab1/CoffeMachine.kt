package lab1

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
        printState()
        print("Choose action (buy, fill, take): \n> ")
        when (readln()) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            else -> println("Incorrect action.")
        }
        printState()
    }

    private fun buy() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:\n> ")
        when (readln()) {
            "1" -> makeCoffee(250, 0, 16, 4)
            "2" -> makeCoffee(350, 75, 20, 7)
            "3" -> makeCoffee(200, 100, 12, 6)
            else -> println("Incorrect coffee type.")
        }
    }

    private fun makeCoffee(requiredWater: Int, requiredMilk: Int, requiredBeans: Int, price: Int) {
        if (water < requiredWater) {
            println("Sorry, not enough water!")
            return
        }
        if (milk < requiredMilk) {
            println("Sorry, not enough milk!")
            return
        }
        if (coffeeBeans < requiredBeans) {
            println("Sorry, not enough coffee beans!")
            return
        }
        if (cups < 1) {
            println("Sorry, not enough disposable cups!")
            return
        }

        water -= requiredWater
        milk -= requiredMilk
        coffeeBeans -= requiredBeans
        cups -= 1
        money += price

        println("Making you a coffee!")
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

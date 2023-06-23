package testFunctions

fun conditionTest(accountBalance: Double) {
    when {
        accountBalance > 0.0 -> println("The account balance is positive!")
        accountBalance == 0.0 -> println("The account balance is neutral!")
        else -> println("The account balance is negative!")
    }
}
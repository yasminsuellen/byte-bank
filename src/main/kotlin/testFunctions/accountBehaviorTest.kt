package testFunctions

import models.Account

fun accountBehaviorTest() {
    val accountAlex = Account(accountHolder = "Alex", accountNumber = 1111)
    val accountFran = Account(accountHolder = "Fran", accountNumber = 2222)

    println("")
    println("${accountAlex.accountHolder}'s bank account")
    println("models.Account Number: ${accountAlex.accountNumber}")
    println("models.Account Balance: ${accountAlex.accountBallance}")

    println("")
    println("${accountFran.accountHolder}'s bank account")
    println("models.Account Number: ${accountFran.accountNumber}")
    println("models.Account Balance: ${accountFran.accountBallance}")

    accountAlex.toDeposit(amount = 100.0)
    accountFran.toDeposit(amount = 200.0)

    accountAlex.toWithdraw(amount = 20.0)
    accountFran.toWithdraw(amount = 300.0)

    accountAlex.toTransfer(destinationAccount = accountFran, amount = 200.0)
}
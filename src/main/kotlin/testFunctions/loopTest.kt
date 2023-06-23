package testFunctions

fun loopTest() {
    var i = 0
    while (i < 5) {
        val accountHolder: String = "Alex $i"
        val accountNumber: Int = 1000 + i
        var accountBalance: Double = i + 10.0

        println("")
        println("models.Account Holder: $accountHolder")
        println("models.Account Number: $accountNumber")
        println("models.Account Balance: $accountBalance")
        i++
    }
}
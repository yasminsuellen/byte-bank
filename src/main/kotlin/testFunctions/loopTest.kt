package testFunctions

fun loopTest() {
    var i = 0
    while (i < 5) {
        val accountHolder: String = "Alex $i"
        val accountNumber: Int = 1000 + i
        var accountBalance: Double = i + 10.0

        println("")
        println("Account Holder: $accountHolder")
        println("Account Number: $accountNumber")
        println("Account Balance: $accountBalance")
        i++
    }
}
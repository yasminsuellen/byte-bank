fun main() {
    println("")
    println("Welcome to Bytebank!")

    accountBehaviorTest()
}

public fun accountBehaviorTest() {
    val accountAlex = Account(accountHolder = "Alex", accountNumber = 1111)
    val accountFran = Account(accountHolder = "Fran", accountNumber = 2222)

    println("")
    println("${accountAlex.accountHolder}'s bank account")
    println("Account Number: ${accountAlex.accountNumber}")
    println("Account Balance: ${accountAlex.accountBallance}")

    println("")
    println("${accountFran.accountHolder}'s bank account")
    println("Account Number: ${accountFran.accountNumber}")
    println("Account Balance: ${accountFran.accountBallance}")

    accountAlex.toDeposit(amount = 100.0)
    accountFran.toDeposit(amount = 200.0)

    accountAlex.toWithdraw(amount = 20.0)
    accountFran.toWithdraw(amount = 300.0)

    accountAlex.toTransfer(destinationAccount = accountFran, amount = 200.0)
}

class Account(
    var accountHolder: String,
    val accountNumber: Int
) {
    var accountBallance: Double = 0.0
        private set

    fun toDeposit(amount: Double) {
        println("")
        println("Depositing $amount into ${this.accountHolder}'s account!")
        if (amount > 0) {
            println("Balance prior to deposit: ${this.accountBallance}")
            this.accountBallance += amount
            println("Balance after deposit: ${this.accountBallance}")
        } else {
            println("The deposit could not be processed. Reason: Insufficient deposit amount.")
        }
    }

    fun toWithdraw(amount: Double) {
        println("")
        println("Withdrawing $amount from ${this.accountHolder}'s account!")
        if (this.accountBallance >= amount) {
            println("Balance before withdrawal: ${this.accountBallance}")
            accountBallance -= amount
            println("Balance after withdrawal: ${this.accountBallance}")
        } else {
            println("The withdrawal could not be processed. Reason: Insufficient balance.")
        }
    }

    fun toTransfer(destinationAccount: Account, amount: Double) {
        println("")
        println("Transferring $amount from ${this.accountHolder}'s account, to ${destinationAccount.accountHolder}'s account!")
        this.toWithdraw(amount)
        destinationAccount.toDeposit(amount)
    }


}






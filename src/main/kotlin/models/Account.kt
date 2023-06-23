package models

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
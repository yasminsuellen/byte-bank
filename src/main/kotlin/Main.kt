fun main() {
    println("Bem vindo ao Bytebank!")

    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("")
        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        i++
    }
}

    fun testaCondicoes(saldo: Double) {
        when {
            saldo > 0.0 -> println("A conta está positiva!")
            saldo == 0.0 -> println("A conta é neutra!")
            else -> println("A conta é negativa!")
        }
    }
fun main() {
    println("")
    println("Bem vindo ao Bytebank!")

//CONTAS
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1111

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 2222

// PRINTS
    println("")
    println("Conta do ${contaAlex.titular}")
    println("Número da Conta: ${contaAlex.numero}")
    println("Saldo da Conta: ${contaAlex.saldo}")

    println("")
    println("Conta do ${contaFran.titular}")
    println("Número da Conta: ${contaFran.numero}")
    println("Saldo da Conta: ${contaFran.saldo}")

    contaAlex.deposita(100.0)
    contaFran.deposita(200.0)

    contaAlex.saca(20.0)
    contaFran.saca(300.0)

    contaAlex.transfere(contaFran, 200.0)
}

class Conta {
    var titular: String = ""
    var numero: Int = 0
    var saldo: Double = 0.0

    fun deposita(valor: Double) {
        println("")
        println("Depositando $valor na conta de ${this.titular}!")
        println("Saldo anterior ao depósito: ${this.saldo}")
        this.saldo += valor
        println("Saldo após o depósito: ${this.saldo}")
    }

    fun saca(valor: Double) {
        println("")
        println("Sacando $valor na conta de ${this.titular}!")
        if (this.saldo >= valor) {
            println("Saldo anterior ao saque: ${this.saldo}")
            saldo -= valor
            println("Saldo após depósito na conta de destino: ${this.saldo}")
        } else {
            println("Não foi possível realizar o saque. Motivo: saldo insuficiente.")
        }
    }

    fun transfere(contaDestino: Conta, valor: Double) {
        println("")
        println("Transferindo $valor da conta de ${this.titular}, para a conta de ${contaDestino.titular}!")
        this.saca(valor)
        contaDestino.deposita(valor)
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Numero X -> $numeroX")
    println("Numero Y -> $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("Titular da conta do João -> ${contaJoao.titular}")
    println("Titular da conta da Maria -> ${contaMaria.titular}")
}

fun testaLacos() {
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
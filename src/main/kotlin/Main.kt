import models.Conta
import models.Titular

fun main() {

    var alex = Titular ("Alex", "000.000.000-00")
    val contaAlex = Conta (alex, 1000, 500.0)

    println("")
    println("Bem vindo ao Bytebank!")
    println("Titular: ${contaAlex.titular.nome} | " +
            "Conta: ${contaAlex.numeroConta} | " +
            "Saldo: ${contaAlex.saldo}")




//    val titular: String = "Alex"
//    val numeroConta = 1000
//    var saldo: Double = 0.0
//
//    println("")
//    println("Bem vindo ao Bytebank!")
//    println("models.Titular: $titular | models.Conta: $numeroConta | Saldo: $saldo")
//
//    when {
//        saldo < 0.0 -> println("O saldo é negativo!")
//        saldo == 0.0 -> println("O saldo é neutro!")
//        saldo > 0.0 -> println("O saldo é positivo!")
//    }


}
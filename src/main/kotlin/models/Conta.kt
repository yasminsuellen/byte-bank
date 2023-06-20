package models

class Conta(
    val titular: Titular = Titular("", ""),
    val numeroConta: Int,
    var saldo: Double = 0.0,
)
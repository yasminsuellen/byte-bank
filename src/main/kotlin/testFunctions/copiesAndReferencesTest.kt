package testFunctions

import models.Account

fun copiesAndReferencesTest() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Numero X -> $numeroX")
    println("Numero Y -> $numeroY")

    val accountJoao = Account(accountHolder = "João", accountNumber = 3333)
    var accountMaria = Account(accountHolder = "Maria", accountNumber = 3333)
    accountMaria.accountHolder = accountJoao.accountHolder

    println("Titular da conta do João -> ${accountJoao.accountHolder}")
    println("Titular da conta da Maria -> ${accountMaria.accountHolder}")
}
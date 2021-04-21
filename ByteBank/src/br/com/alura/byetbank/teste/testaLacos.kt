package br.com.alura.byetbank.teste

fun testaLacos() {

    var i = 0
    while (i < 5) {
        i++
        val titular: String = "Pedro $i"
        val nConta: Int = 615722 + i
        var saldo = i + 4000.0


        println("Número da conta: $nConta")
        println("Saldo da conta: $saldo")
        println()
    }

    for (i in 5 downTo 1) {
        val titular: String = "Pedro $i"
        val nConta: Int = 615722 + i
        var saldo = i + 4000.0

        println("Bem vindo ao C6Bank $titular ")
        println("")
        println("Número da conta: $nConta")
        println("Saldo da conta: $saldo")
        println()
    }

}
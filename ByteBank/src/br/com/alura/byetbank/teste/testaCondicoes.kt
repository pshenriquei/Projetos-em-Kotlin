package br.com.alura.byetbank.teste

fun testaCondicoes(saldo: Double) {

    if (saldo > 0.0) {
        println("br.com.alura.byetbank.modelo.Conta está positiva")
    } else if (saldo == 0.0) {
        println("br.com.alura.byetbank.modelo.Conta esta neutra")
    } else {
        println("br.com.alura.byetbank.modelo.Conta está negativa")
    }

    when {
        saldo > 0.0 -> println("br.com.alura.byetbank.modelo.Conta está positiva")
        saldo == 0.0 -> println("br.com.alura.byetbank.modelo.Conta esta neutra")
        else -> println("br.com.alura.byetbank.modelo.Conta está negativa")
    }
}
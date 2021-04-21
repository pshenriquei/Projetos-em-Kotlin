package br.com.alura.byetbank.teste

import br.com.alura.byetbank.modelo.Cliente
import br.com.alura.byetbank.modelo.ContaPoupanca

fun testaRunComJurosCompostos() {
    val taxaAnual = 0.03975
    val taxaMensal = taxaAnual / 12
    println("Taxa Mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Pedro", cpf = "111.111.111-11", senha = 1234), 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento Mensal: $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação Anual; $rendimentoAnual")
}

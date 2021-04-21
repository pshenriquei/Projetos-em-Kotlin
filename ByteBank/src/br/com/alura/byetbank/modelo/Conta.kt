package br.com.alura.byetbank.modelo

import br.com.alura.byetbank.exception.FalhaAutenticacaoException
import br.com.alura.byetbank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) : Autenticavel {

    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun sacar(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficiente, saldo atual: $saldo, valor a ser subtraido: $valor"
            )
        }
        if (!autentica(senha)) {
            throw FalhaAutenticacaoException()
        }
//        throw NumberFormatException()
        saldo -= valor
        destino.deposita(valor)
    }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    override fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}
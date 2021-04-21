package br.com.alura.byetbank.exception

class SaldoInsuficienteException(
        mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem)

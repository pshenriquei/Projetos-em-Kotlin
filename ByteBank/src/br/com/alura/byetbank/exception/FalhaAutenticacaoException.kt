package br.com.alura.byetbank.exception

class FalhaAutenticacaoException(
        mensagem: String = "Falha na Autenticação!"
) : Exception(mensagem)
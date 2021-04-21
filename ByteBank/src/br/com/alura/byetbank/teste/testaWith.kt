package br.com.alura.byetbank.teste

import br.com.alura.byetbank.modelo.Endereco

fun testaWith() {
    val enderecoCompleto = with(Endereco()) {
        logradouro = "Av. dos Mananciais"
        numero = 1343
        bairro = "Taquara"
        cidade = "Rio de Janeiro"
        estado = "RJ"
        cep = "22720-400"
        complemento = "Casa 1, Portão de Madeira"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}

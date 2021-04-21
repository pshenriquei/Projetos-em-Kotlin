package br.com.alura.byetbank.teste

import br.com.alura.byetbank.modelo.Endereco

fun testaNullable() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "Prédio")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
    teste("")
    teste(1)
}

fun teste(valor: Any){
    val numero: Int? = valor as? Int
}
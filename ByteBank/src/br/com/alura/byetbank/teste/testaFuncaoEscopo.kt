package br.com.alura.byetbank.teste

import br.com.alura.byetbank.modelo.Endereco

fun testaScopeFunction() {
//    val endereco = Endereco(logradouro = "Rua Vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    run {
        println("Execução do RUN sem Extensão")
    }

    val endereco = Endereco()
        .also { println("Criando endereço!!") }
        .apply {
            logradouro = "Rua Vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa 1"),
        Endereco(),
        Endereco(complemento = "Ap")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}

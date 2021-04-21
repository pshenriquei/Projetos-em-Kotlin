package br.com.alura.byetbank.teste

import br.com.alura.byetbank.modelo.Endereco

fun testaAny(){

    val endereco = Endereco(
            "Rua vergueiro",
            complemento = "Alura",
            cep = "000-00000")
    val enderecoNovo = Endereco(
            "Rua vergueiro",
            complemento = "Alura",
            cep = "000-00000")

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${
    Integer.toHexString(endereco.hashCode())}")
}

fun imprime(valor: Any): Any {
    println(valor)
    return valor


}

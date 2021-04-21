package br.com.alura.array

fun testaAumentoSalario() {
    val salarios = doubleArrayOf(
        1500.50,
        2300.0,
        5000.0,
        8000.0,
        10000.0
    )

    val aumento = 1.1

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}
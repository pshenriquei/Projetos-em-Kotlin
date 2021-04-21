package br.com.alura.array.teste

fun testaIdade() {
    val idades: IntArray = intArrayOf(
        25,
        19,
        33,
        20,
        55
    )

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println("A maior idade é: $maiorIdade")

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println("A menor idade é: $menorIdade")

    val idades2: IntArray = intArrayOf(
        10,
        12,
        18,
        33,
        40,
        67
    )
    var maiorIdade2 = idades2.max()
    println("Maior Idade: $maiorIdade2")

    val menorIdade2 = idades2.min()
    println("Menor Idade: $menorIdade2")

    val media: Double = idades2.average()
    println("Média: $media")

    val todosMaiores = idades2.all { it >= 18 }
    println("Todos maiores? $todosMaiores")

    val existeMaior = idades2.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior")

    val maiores = idades2.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca = idades2.find { it == 18 }
    println("Busca: $busca")
}

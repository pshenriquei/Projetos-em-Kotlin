package br.com.alura.byetbank.teste

import br.com.alura.byetbank.modelo.*

fun testaFuncionarios() {
    val alex = Analista(
            nome = "Alex",
            cpf = "111.111.111-11",
            salario = 1000.0
    )

    println("Nome: ${alex.nome}")
    println("Cpf: ${alex.cpf}")
    println("Salario: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")

    val fran = Gerente(
            nome = "Fran",
            cpf = "222.222.222-22",
            salario = 2000.0,
            senha = 1234
    )

    println("")
    println("Nome: ${fran.nome}")
    println("Cpf: ${fran.cpf}")
    println("Salario: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    val gui = Diretor(
            nome = "Gui",
            cpf = "333.333.333-33",
            salario = 4000.0,
            senha = 4000,
            plr = 200.0
    )

    println("")
    println("Nome: ${gui.nome}")
    println("Cpf: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")

    if (gui.autentica(4000)) {
        println("Autenticou com sucesso!")
        println("")
    } else {
        println("Falha na autenticação!")
        println("")
    }
    val maria = Analista(
            nome = "Maria",
            cpf = "444.444.444-44",
            salario = 3000.0
    )

    println("")
    println("Nome: ${maria.nome}")
    println("Cpf: ${maria.cpf}")
    println("Salario: ${maria.salario}")
    println("Bonificação: ${maria.bonificacao}")
    println("")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("")
    println("Total de bonificação: ${calculadora.total}")
}
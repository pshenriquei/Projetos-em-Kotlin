package br.com.alura.byetbank.teste

import br.com.alura.byetbank.modelo.Cliente
import br.com.alura.byetbank.modelo.Diretor
import br.com.alura.byetbank.modelo.Gerente
import br.com.alura.byetbank.modelo.SistemaInterno

fun testaAutentcacao() {
    val gerente = Gerente(
            nome = "Alex",
            cpf = "111.111.111-11",
            salario = 1000.0,
            senha = 1000
    )
    val diretora = Diretor(
            nome = "Fran",
            cpf = "222.222.222-22",
            salario = 2000.0,
            senha = 2000,
            plr = 200.0
    )

    val cliente = Cliente(
            nome = "Gui",
            cpf = "333.333.333-33",
            senha = 1234
    )

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)
}
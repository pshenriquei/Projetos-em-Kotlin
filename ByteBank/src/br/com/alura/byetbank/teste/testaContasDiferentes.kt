package br.com.alura.byetbank.teste

import br.com.alura.byetbank.modelo.Cliente
import br.com.alura.byetbank.modelo.ContaCorrente
import br.com.alura.byetbank.modelo.ContaPoupanca
import br.com.alura.byetbank.modelo.Endereco

fun testaContaDiferentes() {
    val contaCorrente = ContaCorrente(
            titular = Cliente(
                    nome = "Alex",
                    cpf = "111.111.111-11",
                    senha = 1,
                    endereco = Endereco(
                            logradouro = "Rua vergueiro"
                    )
            ),
            numero = 1000
    )

    println("Titular ${contaCorrente.titular}")
    println("Nome do Titular ${contaCorrente.titular.nome}")
    println("CPF do Titular ${contaCorrente.titular.cpf}")
    println("Endereço Titular ${contaCorrente.titular.endereco}")

    val contaPoupanca = ContaPoupanca(
            titular = Cliente(
                    nome = "Fran",
                    cpf = "",
                    senha = 2
            ),
            numero = 1001
    )
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Corrente ${contaCorrente.saldo}")
    println("Saldo Poupança ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("")
    println("Saldo após saque C/c: ${contaCorrente.saldo}")
    println("Saldo após saque Poupança: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca,1 )

    println("")
    println("Saldo C/c após transferir p/ Poupança: ${contaCorrente.saldo}")
    println("Saldo Poupança após receber transferência : ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente, 2)

    println("")
    println("Saldo Poupança após transferir p/ C/c: ${contaPoupanca.saldo}")
    println("Saldo C/c após receber transferência : ${contaCorrente.saldo}")
}
package br.com.alura.byetbank.teste

import br.com.alura.byetbank.exception.FalhaAutenticacaoException
import br.com.alura.byetbank.exception.SaldoInsuficienteException
import br.com.alura.byetbank.modelo.Cliente
import br.com.alura.byetbank.modelo.ContaCorrente
import br.com.alura.byetbank.modelo.ContaPoupanca
import java.lang.Exception

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)

    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaFran = ContaPoupanca(titular = fran, numero = 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("______________________________________________________________________________________________")

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("______________________________________________________________________________________________")

    println("Depositando na conta do Alex")
    contaAlex.deposita(valor = 50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(valor = 70.0)
    println(contaFran.saldo)

    println("______________________________________________________________________________________________")

    println("Sacando na conta do Alex")
    contaAlex.sacar(valor = 150.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.sacar(valor = 100.0)
    println(contaFran.saldo)

    println("______________________________________________________________________________________________")

    println("Saque em execesso na conta do Alex")
    contaAlex.sacar(valor = 100.0)
    println(contaAlex.saldo)

    println("Saque em execesso na conta da Fran")
    contaFran.sacar(valor = 500.0)
    println(contaFran.saldo)

    println("______________________________________________________________________________________________")

    println("Transferência da conta da Fran para o Alex")

    try {
        contaFran.transfere(valor = 250.0, destino = contaAlex, senha = 2)
        println("Transfrerência sucedida")
    } catch (e: SaldoInsuficienteException) {
        println(">>>>Falha na transferência")
        println(">>>>Saldo Insuficiente")
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        println(">>>>Falha na transferência!")
        println(">>>>Falha na autenticação!")
        e.printStackTrace()
    } catch (e: Exception) {
        println(">>>>Erro deconhecido")
        e.printStackTrace()

    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}

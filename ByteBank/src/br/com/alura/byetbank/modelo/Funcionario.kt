package br.com.alura.byetbank.modelo

abstract class Funcionario(
        val nome: String,
        val cpf: String,
        val salario: Double
) {
    abstract val bonificacao: Double


}

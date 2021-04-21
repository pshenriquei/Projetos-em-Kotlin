package br.com.alura.byetbank.modelo

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit= {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank!")
            autenticado()
            println("")
        } else {
            println("Falha na autenticação!")
            println("")
        }
    }

    fun entraReceiver (admin: Autenticavel, senha: Int, autenticado: SistemaInterno. () -> Unit= {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao ByteBank!")
            autenticado()
            println("")
        } else {
            println("Falha na autenticação!")
            println("")
        }
    }

    fun pagamento(){
        println("Realizando Pagamento")
    }

}
package um.projeto.diobank.testes

import um.projeto.diobank.Logavel

class TesteAutenticacao {
    fun autentica(logavel: Logavel) = println("Autenticado? ${logavel.login()}")
}
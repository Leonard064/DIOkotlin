package um.projeto.diobank.testes

import um.projeto.diobank.Banco

fun main(){
    val dioBank = Banco(nome="DIObank", numero=10)

    println(dioBank.nome)
    println(dioBank.numero)
}
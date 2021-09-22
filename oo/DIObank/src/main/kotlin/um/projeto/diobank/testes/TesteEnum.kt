package um.projeto.diobank.testes

import um.projeto.diobank.ClienteTipo

//teste para ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        //identificador pode mudar de nome (padrão: it)
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.descricao}")
}
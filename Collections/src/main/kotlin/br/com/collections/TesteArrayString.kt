package br.com.collections

fun main(){
    val nomes = Array(3){""} //cria um array de string (necessita do size e de inicialização)
    //val nomes2 = arrayOf() - arrayOf tbm pode ser utilizado em String

    nomes[0] = "Loren"
    nomes[1] = "Ipsum"
    nomes[2] = "Dolor"

    for (nome in nomes){
        println(nome)
    }

    println("------------")

    nomes.sort() // organiza o array em ordem alfabética
    nomes.forEach { println(it) }

}
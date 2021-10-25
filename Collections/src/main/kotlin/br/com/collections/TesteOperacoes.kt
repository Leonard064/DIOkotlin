package br.com.collections

fun main(){
    val salarios = doubleArrayOf(1000.0, 2750.0, 3220.0, 5000.0, 7530.0, 2200.0, 1150.0)

    for(i in salarios){
        println(i)
    }

    println("------------")

    println("Maior valor: ${salarios.maxOrNull()}") //retorna o maior valor, ou nulo
    println("Menor valor: ${salarios.minOrNull()}") //retorna o menor valor, ou nulo
    println("Média de valores: ${salarios.average()}") // retorna a média aritmética dos valores

    val altoSalarios = salarios.filter { it > 2500.0 } // filtra o array de acordo com a condição passada

    println("------------")
    altoSalarios.forEach { println(it) }

    println("------------")
    println(salarios.count{it in 2000.0..5000.0}) // printa a quantidade de itens no range indicado

    println("------------")
    println(salarios.find { it == 2750.0 }) //printa o elemento indicado (se ele existir no array)

    println("------------")
    println(salarios.any{it == 1000.0}) //busca se a condição é verdadeira

}
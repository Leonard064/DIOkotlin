package br.com.collections

fun main(){
    val values = IntArray(5) //cria um array de INT

    //instanciando valor para cada posição
    values[0] = 1
    values[1] = 2
    values[2] = 3
    values[3] = 4
    values[4] = 5

    //values.sort() - organiza o array em forma crescente

    println("---Versão FOR---")
    for(valor in values){
        println(valor)
    }
    println("------")

    //mesma ação do for
    println("---Versão FOREACH---")
    values.forEach{ i ->
        println(i)
    }
    println("------")

    println("---Versão FOR com index---")
    for(index in values.indices){
        println(values[index])
    }
    println("------")


}
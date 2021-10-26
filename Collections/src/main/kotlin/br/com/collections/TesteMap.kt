package br.com.collections

fun main(){
    val pair: Pair<String, Double> = Pair("João",1000.0) // cria um par de valores
    val map1 = mapOf(pair) //cria um mapa

    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v")}

    val map2 = mapOf("Pedro" to 2500.0, "Kelly" to 3000.0) //utilizando outra sintaxe

    map2.forEach { (k,v)-> println("Chave: $k - Valor: $v") }
}
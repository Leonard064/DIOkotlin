package br.com.collections

fun main(){
    val salarios = arrayOf("2000".toBigDecimal(),"1150".toBigDecimal(),"3250".toBigDecimal())

    val result = salarios.somatorio()
    val result2 = salarios.media()

    println("---------------")
    println("Somatório de valores: $result")
    println("Média de valores: $result2")

}
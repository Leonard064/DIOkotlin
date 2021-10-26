package br.com.collections

fun main(){
    val func1 = Funcionario("João",2150.0,"CLT")
    val func2 = Funcionario("Kelly",1150.0,"PJ")
    val func3 = Funcionario("Mario",3150.0,"CLT")

    val funcionarios = listOf(func1,func2,func3) // cria uma lista com os objetos

    funcionarios.forEach { println(it) }

    println("------------")
    println(funcionarios.find { it.nome == "Kelly" })

    println("------------")
    funcionarios.sortedBy { it.salario }.forEach { println(it) } //sort por salário

    println("------------")
    funcionarios.groupBy {it.tipo}.forEach{println(it)} // agrupamento por tipo

}
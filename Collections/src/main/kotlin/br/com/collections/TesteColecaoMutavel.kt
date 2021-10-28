package br.com.collections

fun main(){
    val func1 = Funcionario("João",2150.0,"CLT")
    val func2 = Funcionario("Kelly",1150.0,"PJ")
    val func3 = Funcionario("Mario",3150.0,"CLT")

    println("------LIST------")
    val funcionarios = mutableListOf(func1,func3) // cria uma lista mutável
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.add(func2) // adiciona itens para a coleção
    funcionarios.forEach { println(it) }

    println("------------")
    funcionarios.remove(func3) // remove itens da coleção
    funcionarios.forEach { println(it) }

    println("------SET------")
    val funcionarioSet = mutableSetOf(func3) // cria um set mutavel
    //funcionarioSet.forEach { println(it) }

    funcionarioSet.add(func1)
    funcionarioSet.add(func2)

    //funcionarioSet.remove(func2)

    funcionarioSet.forEach { println(it) }

}
package br.com.collections

fun main(){
    val func1 = Funcionario("João",2150.0,"CLT")
    val func2 = Funcionario("Kelly",1150.0,"PJ")
    val func3 = Funcionario("Mario",3150.0,"CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(func1.nome,func1)
    repositorio.create(func2.nome,func2)
    repositorio.create(func3.nome,func3)

    println(repositorio.findById(func2.nome))

    println("-------------")
    repositorio.findAll().forEach { println(it) }

    println("-------------")
    repositorio.remove(func1.nome)
    repositorio.findAll().forEach { println(it) }
}
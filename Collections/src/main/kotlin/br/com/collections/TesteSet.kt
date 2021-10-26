package br.com.collections

fun main(){
    val func1 = Funcionario("João",2150.0,"CLT")
    val func2 = Funcionario("Kelly",1150.0,"PJ")
    val func3 = Funcionario("Mario",3150.0,"CLT")

    val funcionario1 = setOf(func1,func3)
    val funcionario2 = setOf(func2)

    val uniao = funcionario1.union(funcionario2) //junta os dois conjuntos
    uniao.forEach{ println(it)}

    println("------------")
    val funcionario3 = setOf(func1,func2,func3)
    val sub = funcionario3.subtract(funcionario2) // subtrai de uma coleção os itens definidos
    sub.forEach { println(it) }

    println("------------")
    val inter = funcionario3.intersect(funcionario2) //acha a interseção entre conjuntos
    inter.forEach { println(it) }

}

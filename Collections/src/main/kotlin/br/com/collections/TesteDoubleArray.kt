package br.com.collections

fun main(){
    val salarios = DoubleArray(3) //cria um double array (necessário inserir o tamanho)

    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 3000.0

    salarios.forEach { println(it) }

    println("------------")

    salarios.forEachIndexed{ idx, salario -> //opera em cima de cada item indexado
        salarios[idx] = salario * 1.1 // 10% do salário
    }

    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.0,3000.0,4500.0)

    println("------------")

    salarios2.forEach { println(it) }

}
package um.projeto.diobank.testes

import um.projeto.diobank.Analista
import um.projeto.diobank.Funcionario
import um.projeto.diobank.Gerente

fun main(){
    val jose = Analista("José Exemplo","78945612300",1800.0)

    printRelatorio.imprime(jose)

    val kelly = Gerente("Kerok","12345678911",5000.0)
    printRelatorio.imprime(kelly)

}


package um.projeto.diobank.testes

import um.projeto.diobank.Funcionario
import java.math.BigDecimal

fun main(){
    val jose = Funcionario("José Exemplo","78945612300", BigDecimal.valueOf(2000.0))

    println(jose.nome)
    println(jose.cpf)
    println(jose.salario)

}
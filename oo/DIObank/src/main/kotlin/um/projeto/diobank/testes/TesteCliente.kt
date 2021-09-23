package um.projeto.diobank.testes

import um.projeto.diobank.Cliente
import um.projeto.diobank.ClienteTipo

fun main(){
    val teste = Cliente(
        nome="Teste da Silva",
        cpf= "12345678900",
        clienteTipo = ClienteTipo.PF,
        senha= "123456"
    )

    println(teste)
    TesteAutenticacao().autentica(teste)
}
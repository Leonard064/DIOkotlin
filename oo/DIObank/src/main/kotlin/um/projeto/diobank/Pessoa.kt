package um.projeto.diobank

class Pessoa {
    var nome: String = "teste"
    var cpf: String = "123.456.789-10"
        private set

    fun pessoaInfo() = "Nome: $nome \n CPF: $cpf"

}

fun main(){
    val teste = Pessoa()

    println(teste.pessoaInfo())

}
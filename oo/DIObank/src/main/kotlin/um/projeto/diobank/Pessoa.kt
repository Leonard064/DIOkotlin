package um.projeto.diobank

class Pessoa {
    var nome: String = "teste"
    var cpf: String = "123.456.789-10"

    inner class Endereco{
        var rua: String = "Rua ABC"
    }
}

fun main(){
    val teste = Pessoa()

    println(teste.nome)
    println(teste.cpf)

    println(teste.Endereco().rua)
}
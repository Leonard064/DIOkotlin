package um.projeto.diobank.testes

import um.projeto.diobank.Funcionario

class printRelatorio {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}
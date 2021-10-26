package br.com.collections


//classe para fins de teste
data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipo: String
){
    override fun toString(): String =
        """
            Nome:    $nome
            Salário: $salario
            Contrato: $tipo
        """.trimIndent()
}
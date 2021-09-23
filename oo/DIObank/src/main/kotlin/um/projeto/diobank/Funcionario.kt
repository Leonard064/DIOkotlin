package um.projeto.diobank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
): Pessoa(nome,cpf){
    //apenas a classe e suas filhas poderão acessar a função
    protected abstract fun calculoBonus(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: $salario
        Auxílio: ${calculoBonus()}
    """.trimIndent()
}
package poo.simulacaobanco

open class Funcionario(
    val nome: String,
    var cpf: String,
    var salario: Double
) {
    fun calculaBonus(): Double {
        salario *= 1.1
        return salario * 0.10
    }
}
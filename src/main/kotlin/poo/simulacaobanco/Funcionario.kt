package poo.simulacaobanco

open class Funcionario(
    val nome: String,
    var cpf: String,
    var salario: Double
) {
    open val calculaBonus: Double get() = this.salario * 1.1

}
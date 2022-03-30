package poo.simulacaobanco

class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double
) {
    fun calculaBonus(): Double {
        salario *= 1.1
        return salario * 0.10
    }
}
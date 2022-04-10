package poo.simulacaobanco

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    var bonus : Double
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val calculaBonus: Double
        get() {
            salario *= 1.1
            return salario * 2
        }
}
package poo.simulacaobanco

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    var bonus : Double
):Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    fun calculabonus ()  {
        this.bonus = this.salario * 4
    }
}
package poo.desafio

class Empresa(
    var nome: String,
    val valorFixo: Double,
    var valorKm: Double
) {


    fun valorTotal(quilometragem : Double): Double {
        return this.valorFixo + ( this.valorKm * quilometragem)
    }
}
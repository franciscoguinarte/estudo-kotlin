package poo.desafio

import poo.simulacaobanco.ClassePessoa
import java.util.Scanner

fun main() {
    val readable = Scanner(System.`in`)

    var dhl = Empresa("DHL", 10.00, 0.05)
    var fedex = Empresa("FedEx", 4.30, 0.12)

    println("Informe o valor da km")
    val quilometros: Double = readable.nextDouble()

    val valorTotalDHL = dhl.valorTotal(quilometros)
    val valorTotalFedEx = fedex.valorTotal(quilometros)


    val pessoa = ClassePessoa("CPF", "NOME")
    pessoa.Nome = "teste"

    println("pessoa " + pessoa.CPF)

    val vantagem =
        if (valorTotalDHL > valorTotalFedEx) "Vantagem de DHL por oferecer valor de $valorTotalDHL menor que $valorTotalFedEx"
        else "Vantagem de FEDEX por oferecer valor de $valorTotalFedEx menor que $valorTotalDHL"

    println(vantagem)
}

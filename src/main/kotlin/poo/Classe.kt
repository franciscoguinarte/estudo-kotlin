package poo

public class Classe {
    private var atributo: Int = 0
    private var atributo2: String = "";
    private var atributo3: Boolean = false;
    private var atributo4: Double = 0.0;

    constructor(atributo: Int, atributo2: String, atributo3: Boolean, atributo4: Double) {
        this.atributo = atributo
        this.atributo2 = atributo2
        this.atributo3 = atributo3
        this.atributo4 = atributo4
    }

    fun getAtributo(): Int {
        return atributo
    }
    fun setAtributo(atributo: Int) {
        this.atributo = atributo
    }



}
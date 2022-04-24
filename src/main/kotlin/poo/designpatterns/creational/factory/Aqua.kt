package poo.designpatterns.creational.factory

class Aqua(composition:String, mass: Int) {

//    override fun doShipping(way: String): String {
//        return "Water"
//    }

    companion object{
        fun aquaFactoryOneType(): Aqua {
            return Aqua("H2O",123);
        }
    }
    fun aquaFactoryVariousType(): Aqua {
        return Aqua("H2OH",123);
    }

}
package poo.designpatterns.creational.factory

abstract class Transport {

    open fun doShipping(way: String): String{
        return "DoShipping with" + way
    }
    var aqua1 = Aqua.aquaFactoryOneType();


}
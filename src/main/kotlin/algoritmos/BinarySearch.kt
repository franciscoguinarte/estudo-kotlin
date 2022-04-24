package algoritmos
fun main(){
    val array = listOf(1,2,3,4,5,6,7,8,9,10)
    var indice: Int = BinarySearch.buscaBinaria(array, 8)

    println("Indice = " + indice)
    print("Valor = " + array[indice])

}
class BinarySearch {
    companion object {
    fun buscaBinaria(array: List<Int>, item: Int):Int{
        var menor = 0
        var maior = array.size - 1
        var cont = 1
        while(menor < maior){
            println("Passou aqui = " + cont)
            cont ++
            val meio = ((maior + menor) / 2).toInt()

            if(array[meio] == item){
                return meio
            }
            else if (item > array[meio]){
                menor = meio + 1
            }
            else {
                maior = meio - 1
            }
        }
        return -1
    }
}
}
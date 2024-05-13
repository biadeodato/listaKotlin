class Data(var dia: Int, var mes: Int, var ano: Int){
    fun imprimir(){
        println("$dia/$mes/$ano")
    }
}
fun main(){
    val data1 = Data(14,2,2007)
    
    data1.imprimir()
}

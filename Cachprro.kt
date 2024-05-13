class Cachorro(var nome: String, var raca: String, var idade: Int){
    fun latir(){
        println("Au au!")
    }
}
fun main(){
   val c1 = Cachorro("Rambo", "Pastor alemão", 4)
   c1.latir()
}

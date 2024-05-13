class Animal(var nome: String, var tipo: String){
    fun emitirSom(){
        println("O som do $nome está sendo emitido")
    }
}
fun main(){
   val animal1 = Animal("cachorro", "terrestre")
   
   animal1.emitirSom()
}

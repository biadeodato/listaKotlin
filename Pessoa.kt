class Pessoa(val nome: String, val idade: Int, var altura: Double){
  fun imprimir(){
     println("Nome: $nome\n Idade: $idade\n Altura: $altura\n")
  }  
}
fun main(){
    val pessoas = Pessoa("Beatriz", 17, 1.60)
    pessoas.imprimir()
}

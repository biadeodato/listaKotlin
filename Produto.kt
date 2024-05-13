class Produto(var nome: String, var preco: Double, var quantidade: Int){
    fun total(){
        println(preco * quantidade)
    }
}
fun main(){
   val p1 = Produto("Arroz", 3.0, 2)
   p1.total()
}

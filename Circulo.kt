class Circulo(var raio: Double){
    val pi: Double = 3.14
    fun calcArea(){
        println(raio*raio * pi)
    }
    fun calcPerimetro(){
        println(2 * pi * raio)
    }
}

fun main(){
   val circ1 = Circulo(3.0)
   
   circ1.calcArea()
   circ1.calcPerimetro()
}

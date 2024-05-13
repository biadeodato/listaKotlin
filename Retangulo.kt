class Retangulo(var base: Double, var altura: Double){
    fun calcArea(){
        println(base * altura)
    }
    
    fun calcPerimetro(){
        println(base*2 + altura*2)
    }
}

fun main(){
    val retangulo1 = Retangulo(2.0,5.0)
    
    retangulo1.calcArea()
    retangulo1.calcPerimetro()
}

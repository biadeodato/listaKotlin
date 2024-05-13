class Calculadora(){
    fun somar(A:Int, B:Int){
        println(A+B)
    }
    fun subtrair(A:Int, B:Int){
        println(A-B)
    }
    fun multiplicar(A:Int, B:Int){
        println(A*B)
    }
    fun dividir(A:Int, B:Int){
        println(A/B)
    }
    
}
fun main(){
   val calcu = Calculadora()
   calcu.somar(2,1)
   calcu.subtrair(2,1)
   calcu.multiplicar(2,1)
   calcu.dividir(4,2) 
}

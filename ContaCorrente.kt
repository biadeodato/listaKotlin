class ContaCorrente ( val numeroDaConta: Int, var saldo: Double){
    fun depositar(valor: Double){
        saldo = saldo + valor
    }
    fun sacar(valor: Double){
        if(valor <= saldo){
           saldo = saldo - valor
        }else{
            println ("Saque não aprovado")
        }
        
    }
   fun imprimir(){
       println("Conta: $numeroDaConta\n Saldo: R$ $saldo")
   } 
}
fun main(){
    val conta = ContaCorrente(40028922, 19000.750)
    conta.imprimir()
}

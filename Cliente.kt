class Cliente(var nome: String, var cpf: String, var dia: Int, var mes: Int, var ano: Int){
    fun imprimir(){
        println("Nome: $nome\nCPF: $cpf\nData de nascimento: $dia/$mes/$ano")
    }
}

fun main(){
    val c1 = Cliente("Ryan", "123.456.789-11", 23, 2, 2007)
    c1.imprimir()
}

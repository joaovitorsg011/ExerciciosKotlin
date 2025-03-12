fun Somador(a: Int, b: Int){
    var soma = a + b
    print("a soma de $a + $b = $soma")
}

fun main(){
    println("Digite o valor de A: ")
    var a = readLine()!!.toInt()

    println("Digite o valor de B: ")
    var b = readLine()!!.toInt()

    Somador(a, b)
}
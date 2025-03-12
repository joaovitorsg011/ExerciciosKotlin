fun Somador(num: Double, num2: Double){
   var soma = num + num2
    print("A soma de $num e $num2 é $soma")

}


fun main() {

    println("Digite um número: ")
    var num = readLine()!!.toDouble()

    println("Digite um segundo número: ")
    var num2 = readLine()!!.toDouble()

    Somador(num, num2)
}

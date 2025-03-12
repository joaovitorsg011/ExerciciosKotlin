fun main(){

    println("Digite um numero: ")
    var numero = readLine()!!.toInt()

    for (i in 0..10) {
        var result = numero * i

        println(result)
    }


}
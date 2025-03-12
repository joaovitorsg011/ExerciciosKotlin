fun Potencia(base : Double, expoente: Double): Double {
    return Math.pow(base, expoente.toDouble())
}

fun main(){

    println("Digite a base: ")
    var base = readLine()!!.toDouble()

    println("Digite a expoente: ")
    var expoente = readLine()!!.toDouble()


    Potencia(base,expoente)

    println("$base elevado a $expoente é ${Potencia(base,expoente)}")
}

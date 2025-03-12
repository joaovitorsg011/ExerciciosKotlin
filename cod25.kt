fun main() {
    println("Digite o comprimento do primeiro segmento de reta: ")
    val a = readLine()!!.toDouble()

    println("Digite o comprimento do segundo segmento de reta: ")
    val b = readLine()!!.toDouble()

    println("Digite o comprimento do terceiro segmento de reta: ")
    val c = readLine()!!.toDouble()
    
    if (a + b > c && a + c > b && b + c > a) {
        println("Os segmentos podem formar um triângulo!")
    } else {
        println("Os segmentos NÃO podem formar um triângulo!")
    }
}

fun main() {
    println("Digite o comprimento do primeiro segmento de reta: ")
    val a = readLine()!!.toDouble()

    println("Digite o comprimento do segundo segmento de reta: ")
    val b = readLine()!!.toDouble()

    println("Digite o comprimento do terceiro segmento de reta: ")
    val c = readLine()!!.toDouble()

    if (a + b > c && a + c > b && b + c > a) {
        println("Os segmentos podem formar um triângulo!")
    if (a == b && b == c) {
        println("Este triângulo é EQUILÁTERO (todos os lados são iguais).")
    } else if (a == b || b == c || a == c) {
        println("Este triângulo é ISÓSCELES (dois lados são iguais).")
    } else {
        println("Este triângulo é ESCALENO (todos os lados são diferentes).")
    }
} else {
    println("Os segmentos NÃO podem formar um triângulo!")
}
}

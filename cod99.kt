fun SuperSomador(inicio: Int, fim: Int): Int {
    return (inicio..fim).sum()
}

fun main() {
    println("Digite o primeiro número: ")
    val numero1 = readLine()!!.toInt()

    println("Digite o segundo número: ")
    val numero2 = readLine()!!.toInt()
    
    println("A soma de todos os números entre $numero1 e $numero2 é: ${SuperSomador(numero1, numero2)}")
}

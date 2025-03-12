fun main() {
  
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readLine()!!.toInt()

    print("Digite a razão da PA: ")
    val razao = readLine()!!.toInt()

    var soma = 0

    println("\nOs 10 primeiros termos da PA são:")

    for (i in 0..9) {
        val termo = primeiroTermo + i * razao
        println(termo)
        soma += termo
    }

    println("\nA soma dos 10 primeiros termos da PA é: $soma")
}

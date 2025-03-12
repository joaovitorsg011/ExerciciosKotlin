fun main() {
    var maiorPreco = 0.0
    var menorPreco = Double.MAX_VALUE

    repeat(8) {
        val preco = readLine()!!.toDouble()
        maiorPreco = maxOf(maiorPreco, preco)
        menorPreco = minOf(menorPreco, preco)
    }

    println("Maior preço: R$ $maiorPreco")
    println("Menor preço: R$ $menorPreco")
}

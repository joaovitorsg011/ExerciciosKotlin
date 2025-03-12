fun main() {
    var soma = 0
    var count = 0
    var menorValor = Int.MAX_VALUE
    var countPares = 0
    var opc = 0


    do {

        println("Digite um número: ")
        val numero = readLine()!!.toInt()


        soma += numero
        count++


        if (numero < menorValor) {
            menorValor = numero
        }


        if (numero % 2 == 0) {
            countPares++
        }
        println("Deseja continuar? (sim ou não)")
       var resp = readLine()!!.toString()

        if(resp == "não" || resp == "nao" || resp == "Não" || resp == "Nao") {
                opc = 1
        }

    } while (opc == 0)


    val media = if (count > 0) soma / count.toDouble() else 0.0


    println("\nResultados:")
    println("Somatório de todos os valores: $soma")
    println("Menor valor digitado: $menorValor")
    println("Média dos valores: %.2f".format(media))
    println("Quantidade de números pares: $countPares")
}

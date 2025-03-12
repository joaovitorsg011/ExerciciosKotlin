fun main() {

    val vetor = IntArray(15)


    println("Digite 15 números:")
    for (i in vetor.indices) {
        print("Número ${i + 1}: ")
        vetor[i] = readLine()!!.toInt()
    }

    println("\nVetor completo:")
    for (num in vetor) {
        print("$num ")
    }


    println("\n\nPosições onde os números são múltiplos de 10:")
    for (i in vetor.indices) {
        if (vetor[i] % 10 == 0) {
            println("Posição ${i + 1}: ${vetor[i]}")
        }
    }
}

fun main() {

    val vetor = IntArray(10)


    println("Digite 10 números:")
    for (i in vetor.indices) {
        print("Número ${i + 1}: ")
        vetor[i] = readLine()!!.toInt()
    }

    println("\nVetor completo:")
    for (num in vetor) {
        print("$num ")
    }



    for (i in vetor.indices) {
        if (vetor[i] % 2 == 0) {
            println("Posição ${i + 1}: ${vetor[i]} é par")
        }

        }
    
}

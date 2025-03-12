fun main() {

    val vetor = IntArray(15)

  
    vetor[0] = 0
    vetor[1] = 1


    for (i in 2 until vetor.size) {
        vetor[i] = vetor[i - 1] + vetor[i - 2]
    }

    for (i in vetor) {
        print("$i ")
    }
}

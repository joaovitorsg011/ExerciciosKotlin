fun main() {
    // Cria um vetor com 10 posições
    val vetor = IntArray(10)

  
    var valor = 5
    for (i in 0 until vetor.size) {
        vetor[i] = valor
        valor += 5 // Aumenta 5 a cada passo
    }

    for (i in vetor) {
        print("$i ")
    }
}

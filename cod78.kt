fun main() {
    val vetor = Array(7) { "" }


    for (i in vetor.indices) {
        println("Digite o seu nome: ")
        vetor[i] = readLine()!!.toString()
    }

    // Exibe os nomes na ordem inversa
    println("Nomes em ordem inversa:")
    for (i in vetor.indices.reversed()) {
        println(vetor[i])
    }
}

fun main() {
    // Cria um vetor com 8 posições para armazenar as idades
    val idades = IntArray(8)


    println("Digite a idade de 8 pessoas:")
    for (i in idades.indices) {
        print("Idade da pessoa ${i + 1}: ")
        idades[i] = readLine()!!.toInt() 
    }


    val soma = idades.sum()
    val media = soma / idades.size.toDouble()

    println("\nMédia de idade das pessoas: %.2f".format(media))


    println("\nPessoas com mais de 25 anos:")
    for (i in idades.indices) {
        if (idades[i] > 25) {
            println("Posição ${i + 1}: Idade ${idades[i]}")
        }
    }

    // Encontrando a maior idade
    val maiorIdade = idades.maxOrNull() ?: 0

    println("\nMaior idade digitada: $maiorIdade")
    println("Posições onde a maior idade foi digitada:")
    for (i in idades.indices) {
        if (idades[i] == maiorIdade) {
            println("Posição ${i + 1}")
        }
    }
}

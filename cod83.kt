fun main() {
    val notas = DoubleArray(10)


    println("Digite as notas de 10 alunos:")
    for (i in notas.indices) {
        print("Nota do aluno ${i + 1}: ")
        notas[i] = readLine()!!.toDouble()
    }


    val soma = notas.sum()
    val media = soma / notas.size


    println("\nMédia da turma: %.2f".format(media))


    var alunosAcimaDaMedia = 0
    for (nota in notas) {
        if (nota > media) {
            alunosAcimaDaMedia++
        }
    }


    println("Número de alunos acima da média: $alunosAcimaDaMedia")

    val maiorNota = notas.maxOrNull() ?: 0.0


    println("\nMaior nota digitada: $maiorNota")
    println("Posições onde a maior nota foi digitada:")
    for (i in notas.indices) {
        if (notas[i] == maiorNota) {
            println("Posição ${i + 1}")
        }
    }
}

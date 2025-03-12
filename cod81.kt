import kotlin.random.Random

fun main() {

    val vetor = IntArray(30)


    for (i in vetor.indices) {
        vetor[i] = Random.nextInt(1, 16)

        print("Digite um número (chave) entre 1 e 15: ")
        val chave = readLine()!!.toInt()


        var count = 0
        println("\nPosições onde a chave $chave foi encontrada:")

        for (i in vetor.indices) {
            if (vetor[i] == chave) {
                println("Posição ${i + 1}: Valor ${vetor[i]}")
                count++
            }
        }

        if (count == 0) {
            println("A chave $chave não foi encontrada no vetor.")
        } else {
            println("\nA chave $chave apareceu $count vez(es).")
        }
    }

}
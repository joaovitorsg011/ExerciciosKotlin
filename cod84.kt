import kotlin.random.Random

fun main() {
    val vetor = IntArray(20)


    for (i in vetor.indices) {
        vetor[i] = Random.nextInt(0, 100)
    }

    println("Números gerados:")
    for (num in vetor) {
        print("$num ")
    }

    // Ordena o vetor em ordem crescente
    vetor.sort()

    println("\n\nNúmeros ordenados em ordem crescente:")
    for (num in vetor) {
        print("$num ")
    }
}

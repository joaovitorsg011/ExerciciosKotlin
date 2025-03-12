import kotlin.random.Random

fun main() {

    val vetor = IntArray(7)


    for (i in vetor.indices) {
        vetor[i] = Random.nextInt(0, 101) // Gera um número aleatório entre 0 e 100
    }
    
    println("Números gerados:")
    for (num in vetor) {
        println(num)
    }
}

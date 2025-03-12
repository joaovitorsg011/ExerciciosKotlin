import kotlin.random.Random

fun main() {
    println("Bem-vindo ao jogo de Adivinhação!")
    println("O computador vai sortear um número entre 1 e 10.")
    println("Você tem 4 tentativas para acertar.")

    val numeroSorteado = Random.nextInt(1, 11)
    var tentativas = 0

    while (tentativas < 4) {
        print("\nTente adivinhar o número (entre 1 e 10): ")
        val numeroTentativa = readLine()?.toIntOrNull()

        if (numeroTentativa !in 1..10) {
            println("Por favor, escolha um número entre 1 e 10.")
            continue
        }

        tentativas++

        if (numeroTentativa == numeroSorteado) {
            println("Parabéns! Você acertou o número em $tentativas tentativas.")
            return
        } else {
            println("Errou! Você ainda tem ${4 - tentativas} tentativa(s).")
        }
    }

    println("\nVocê esgotou suas 4 tentativas. O número sorteado era $numeroSorteado.")
}

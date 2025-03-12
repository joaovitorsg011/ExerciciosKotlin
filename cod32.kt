import kotlin.random.Random

fun main() {
    println("Bem-vindo ao jogo de Adivinhação!")
    println("O computador vai sortear um número entre 1 e 5.")


    val numeroSorteado = Random.nextInt(1, 6)


    var tentativas = 0
    var numeroTentativa: Int

    while (true) {
        println("\nTente adivinhar o número (entre 1 e 5):")
        numeroTentativa = readLine()?.toIntOrNull() ?: continue

        // Verifica se a entrada é válida (entre 1 e 5)
        if (numeroTentativa !in 1..5) {
            println("Por favor, escolha um número entre 1 e 5.")
            continue
        }

        tentativas++

        if (numeroTentativa == numeroSorteado) {
            println("Parabéns! Você acertou o número em $tentativas tentativas.")
            break
        } else {
            println("Errou! Tente novamente.")
        }
    }
}

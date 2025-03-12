import kotlin.random.Random

fun main() {
    println("Bem-vindo ao jogo Pedra, Papel, Tesoura!")


    val opcoes = listOf("Pedra", "Papel", "Tesoura")


    while (true) {

        println("\nEscolha sua jogada (Pedra, Papel, Tesoura) ou 'sair' para encerrar:")
        val jogadorEscolha = readLine()?.capitalize() ?: ""


        if (jogadorEscolha == "Sair") {
            println("Obrigado por jogar!")
            break
        }


        if (jogadorEscolha !in opcoes) {
            println("Escolha inválida. Tente novamente.")
            continue
        }


        val computadorEscolha = opcoes[Random.nextInt(opcoes.size)]


        println("Você escolheu: $jogadorEscolha")
        println("O computador escolheu: $computadorEscolha")


        if (jogadorEscolha == computadorEscolha) {
            println("Empate!")
        } else if ((jogadorEscolha == "Pedra" && computadorEscolha == "Tesoura") ||
            (jogadorEscolha == "Papel" && computadorEscolha == "Pedra") ||
            (jogadorEscolha == "Tesoura" && computadorEscolha == "Papel")) {
            println("Você venceu!")
        } else {
            println("O computador venceu!")
        }

    }
}

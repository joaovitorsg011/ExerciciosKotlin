fun main() {
    var opc = 0
    var maiorIdade = 0
    var contHomens = 0
    var somaIdadeHomens = 0
    var idadeMulherMaisJovem = Int.MAX_VALUE  // Começa com um valor muito alto para ser substituído

    while (opc == 0) {
        println("Qual é o seu sexo? (Homem ou Mulher)")
        val sexo = readLine()!!.trim()

        if (sexo != "Homem" && sexo != "Mulher") {
            println("Opção inválida. Tente novamente.")
            continue
        }

        println("Qual é a sua idade?")
        val idade = readLine()!!.toInt()


        if (idade > maiorIdade) {
            maiorIdade = idade
        }

        if (sexo == "Homem") {
            contHomens++
            somaIdadeHomens += idade
        }


        if (sexo == "Mulher" && idade < idadeMulherMaisJovem) {
            idadeMulherMaisJovem = idade
        }


        println("Deseja continuar? (Sim ou Não)")
        val opcao = readLine()!!.toString()

        if (opcao == "não" || opcao == "nao" || opcao == "Não" || opcao == "Nao") {
           opc = 1
        }
    }


    println("\nResultados:")
    println("Maior idade lida: $maiorIdade")
    println("Número de homens cadastrados: $contHomens")
    if (contHomens > 0) {
        val mediaHomens = somaIdadeHomens / contHomens.toDouble()
        println("Média de idade entre os homens: %.2f".format(mediaHomens))
    } else {
        println("Não há homens cadastrados.")
    }
    if (idadeMulherMaisJovem != Int.MAX_VALUE) {
        println("Idade da mulher mais jovem: $idadeMulherMaisJovem")
    } else {
        println("Não há mulheres cadastradas.")
    }
}

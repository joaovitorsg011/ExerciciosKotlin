fun main() {
    var somaIdades = 0
    var countPessoas = 0
    var maiorIdade = 0
    var nomePessoaMaisVelha = ""
    var nomeMulherMaisJovem = ""
    var mulherMaisJovem = Int.MAX_VALUE
    var homensMais30 = 0
    var mulheresMenos18 = 0

    var opc = 0

    while (opc == 0) {
        println("Qual é o seu nome?")
        val nome = readLine()!!

        println("Qual é a sua idade?")
        val idade = readLine()!!.toInt()

        println("Qual é o seu sexo? (Masculino ou Feminino)")
        val sexo = readLine()!!


        somaIdades += idade
        countPessoas++


        if (idade > maiorIdade) {
            maiorIdade = idade
            nomePessoaMaisVelha = nome
        }

        if (sexo == "Feminino" && idade < mulherMaisJovem) {
            mulherMaisJovem = idade
            nomeMulherMaisJovem = nome
        }


        if (sexo == "Masculino" && idade > 30) {
            homensMais30++
        }


        if (sexo == "Feminino" && idade < 18) {
            mulheresMenos18++
        }

        println("Deseja continuar? (Sim ou Não)")
        val opcao = readLine()!!.toString()

        if (opcao == "não" || opcao == "nao" || opcao == "Não" || opcao == "Nao") {
            opc = 1
        }
    }


    val mediaIdade = if (countPessoas > 0) somaIdades / countPessoas else 0


    println("\nResultados:")
    println("Pessoa mais velha: $nomePessoaMaisVelha com $maiorIdade anos")
    println("Mulher mais jovem: $nomeMulherMaisJovem com $mulherMaisJovem anos")
    println("Média de idade do grupo: $mediaIdade anos")
    println("Homens com mais de 30 anos: $homensMais30")
    println("Mulheres com menos de 18 anos: $mulheresMenos18")
}

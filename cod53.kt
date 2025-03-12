fun main(){
    var somaIdades = 0
    var countMaior18 = 0
    var countMenor5 = 0
    var maiorIdade = 0

    for (i in 1..10) {
        println("Qual é a sua idade? Pessoa $i:")
        val idade = readLine()!!.toInt()

        somaIdades += idade

        if (idade > 18) {
            countMaior18++
        }

        if (idade < 5) {
            countMenor5++
        }

        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }


    val mediaIdade = somaIdades / 10.0

    // Exibe os resultados
    println("Média de idade do grupo: $mediaIdade")
    println("Pessoas com mais de 18 anos: $countMaior18")
    println("Pessoas com menos de 5 anos: $countMenor5")
    println("Maior idade registrada: $maiorIdade")
}
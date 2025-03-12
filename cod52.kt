fun main() {

    var somaIdadeGrupo = 0
    var somaIdadeHomens = 0
    var countHomens = 0
    var countMulheresMais20 = 0


    for (i in 1..5) {
        println("Pessoa $i")

        // Ler a idade
        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (Masculino | Feminino): ")
        val sexo = readLine()!!


        somaIdadeGrupo += idade


        if (sexo == "Masculino") {
            countHomens++
            somaIdadeHomens += idade
        }


        if (sexo == "Feminino" && idade > 20) {
            countMulheresMais20++
        }
    }


    val mediaIdadeGrupo = somaIdadeGrupo / 5.0
    val mediaIdadeHomens = if (countHomens > 0) somaIdadeHomens / countHomens.toDouble() else 0.0


    println("\nResultados:")
    println("Número de homens cadastrados: $countHomens")
    println("Média de idade do grupo: %.2f".format(mediaIdadeGrupo))
    println("Média de idade dos homens: %.2f".format(mediaIdadeHomens))
    println("Número de mulheres com mais de 20 anos: $countMulheresMais20")
}

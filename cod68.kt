fun main() {
    var pesoMulherTotal = 0.0
    var countMulheres = 0
    var countHomensAcima100 = 0
    var maiorPesoHomem = 0.0

    for (i in 1..8) {
        println("Pessoa $i:")
        println("Digite o sexo (Masculino | Feminino):")
        val sexo = readLine()!!.toString().capitalize()

        println("Qual é o seu peso?")
        val peso = readLine()!!.toDouble()

        if (sexo == "Masculino") {
            if (peso > 100) countHomensAcima100++
            if (peso > maiorPesoHomem) maiorPesoHomem = peso
        } else if (sexo == "Feminino") {
            countMulheres++
            pesoMulherTotal += peso
        }
    }


    val mediaPesoMulheres = pesoMulherTotal / countMulheres


    println("\nResultados:")
    println("Mulheres cadastradas: $countMulheres")
    println("Homens com mais de 100kg: $countHomensAcima100")
    println("Média de peso das mulheres: %.2f".format(mediaPesoMulheres))
    println("Maior peso entre os homens: %.2f".format(maiorPesoHomem))
}

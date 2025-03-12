fun main() {
    var soma = 0.0
    var cont = 0
    var opc = 0

    while (opc == 0) {
        println("Qual é a sua idade? (Para parar o programa digite 999)")
        val idade = readLine()!!.toInt()

        if (idade == 999) {
          opc = 1
        }

        soma += idade
        cont++
    }

    if (cont > 0) {
        val mediaIdade = soma / cont
        println("Número de alunos na turma: $cont")
        println("Média de idade do grupo: %.2f".format(mediaIdade))
    } else {
        println("Nenhuma idade foi registrada.")
    }
}

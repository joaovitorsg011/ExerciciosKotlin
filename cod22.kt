fun main(){
    println("Digite o seu ano de nascimento")
    var ano = readLine()!!.toInt()

    val anoAtual = 2025
    val idade = anoAtual - ano


    if (idade < 18) {
        val anosFaltando = 18 - idade
        println("Você é menor de 18 anos. Faltam $anosFaltando anos para se alistar.")
    } else if (idade == 18) {
        println("Você tem 18 anos. É hora de se alistar.")
    } else {
        val anosPassados = idade - 18
        println("Já se passaram $anosPassados anos desde o seu alistamento.")
    }
}
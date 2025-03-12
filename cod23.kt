fun main() {
    println("Qual é seu nome: ")
    val nome = readLine()!!.toString()

    println("Qual é o seu sexo? (Masculino | Feminino)")
    var sexo = readLine()!!.toString().trim()

    // Tornando o sexo mais flexível
    if (sexo == "Feminino") {
        println("Qual é o valor das compras: ")
        val valor = readLine()!!.toDoubleOrNull()

        if (valor != null && valor > 0) {
            val valorPromocional = valor * (1 - 0.13)
            println("O valor promocional para as mulheres com promoção de 13% ficou: R$ $valorPromocional")
        } else {
            println("Valor de compra inválido!")
        }
    } else if (sexo == "Masculino") {
        println("Qual é o valor das compras: ")
        val valor = readLine()!!.toDoubleOrNull()

        if (valor != null && valor > 0) {
            val valorPromocionalMasculino = valor * (1 - 0.05)
            println("O valor promocional para o público masculino com 5% de desconto ficou: R$ $valorPromocionalMasculino")
        } else {
            println("Valor de compra inválido!")
        }
    } else {
        println("Sexo inválido! Por favor, insira 'Masculino' ou 'Feminino'.")
    }
}

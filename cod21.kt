fun verificarBissexto(ano: Int): Boolean {
    return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)
}

fun main() {
    print("Digite um ano: ")
    val ano = readLine()!!.toInt()

    if (verificarBissexto(ano)) {
        println("O ano $ano é bissexto.")
    } else {
        println("O ano $ano não é bissexto.")
    }
}
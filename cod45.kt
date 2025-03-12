fun main() {
    println("Digite o valor inicial: ")
    var valor_inicial = readLine()!!.toInt()

    println("Digite o valor final: ")
    var valor_final = readLine()!!.toInt()

    println("Digite o incremento: ")
    var incremento = readLine()!!.toInt()


    if (valor_inicial <= valor_final) {

        while (valor_inicial <= valor_final) {
            print("$valor_inicial ")
            valor_inicial += incremento
        }
    } else {

        while (valor_inicial >= valor_final) {
            print("$valor_inicial ")
            valor_inicial -= incremento
        }
    }

    println("\nAcabou!")
}

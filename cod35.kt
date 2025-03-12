fun main() {

    println("Qual o tipo de carro alugado? (Popular/Luxo)")
    val tipoCarro = readLine()!!.capitalize()

    if (tipoCarro != "Popular" && tipoCarro != "Luxo") {
        println("Tipo de carro inválido. Apenas 'Popular' ou 'Luxo' são permitidos.")
        return
    }

    println("Quantos dias de aluguel?")
    val dias = readLine()!!.toDouble()


    println("Quantos Km foram percorridos?")
    val kmPercorridos = readLine()!!.toInt()

    var precoAluguel = 0.0
    var precoKm = 0.0


    if (tipoCarro == "Popular") {
        precoAluguel = dias * 90


        if (kmPercorridos <= 100) {
            precoKm = kmPercorridos * 0.20
        } else {
            precoKm = kmPercorridos * 0.10
        }
    } else if (tipoCarro == "Luxo") {

        precoAluguel = dias * 150


        if (kmPercorridos <= 200) {
            precoKm = kmPercorridos * 0.30
        } else {
            precoKm = kmPercorridos * 0.25
        }
    }


    val total = precoAluguel + precoKm


    println("Preço do aluguel: R$ %.2f".format(precoAluguel))
    println("Preço pelos Km percorridos: R$ %.2f".format(precoKm))
    println("Total a ser pago: R$ %.2f".format(total))
}

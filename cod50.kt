import kotlin.random.Random

fun main() {
    var acimaDeCinco = 0
    var divisiveisPorTres = 0


    for (i in 1..20) {
        val numero = Random.nextInt(0, 11) 


        print("$numero ")


        if (numero > 5) acimaDeCinco++


        if (numero % 3 == 0) divisiveisPorTres++
    }

    println("\nQuantidade de números acima de 5: $acimaDeCinco")
    println("Quantidade de números divisíveis por 3: $divisiveisPorTres")
}

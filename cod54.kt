fun main() {
    var somaAltura = 0.0
    var countMais90Kg = 0
    var countMenos50KgMenos160m = 0
    var countMais190mMais100Kg = 0
    val totalPessoas = 7

    for (i in 1..totalPessoas) {
        println("Pessoa $i")
        print("Digite seu peso (kg): ")
        val peso = readLine()!!.toDouble()

        print("Digite sua altura (m): ")
        val altura = readLine()!!.toDouble()

       
        somaAltura += altura


        if (peso > 90) {
            countMais90Kg++
        }

        if (peso < 50 && altura < 1.60) {
            countMenos50KgMenos160m++
        }


        if (altura > 1.90 && peso > 100) {
            countMais190mMais100Kg++
        }
    }


    val mediaAltura = somaAltura / totalPessoas

    println("\nResultados:")
    println("Média de altura do grupo: %.2f".format(mediaAltura))
    println("Pessoas que pesam mais de 90kg: $countMais90Kg")
    println("Pessoas com menos de 50kg e menos de 1.60m: $countMenos50KgMenos160m")
    println("Pessoas que medem mais de 1.90m e pesam mais de 100kg: $countMais190mMais100Kg")
}

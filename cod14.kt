fun main() {

    println("Qual a quantidade de KM percorridos por um carro alugado")
    var quantidade_percorrido = readln().toDouble()

    println("Qual a quantidade de dias que o carro foi alugado?")
    var quantidade_dias = readln().toDouble()

    var preco_total_dias = quantidade_dias * 90
    var preco_total_km = quantidade_percorrido * 0.20


    var preco_total_percorrido = preco_total_dias + preco_total_km
    println("$preco_total_percorrido" )

}

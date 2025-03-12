fun main(){
    println("Qual é o preço do produto")
    val produto = readln().toDouble()


    var preco_promocional = produto * (1 - 0.05)

    print("O preço promocional com 5% de desconto é: R$ $preco_promocional")
}
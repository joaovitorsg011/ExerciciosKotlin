fun main(){
    println("Qual é a altura da sua piramide? ")
    var altura = readln().toDouble()

    println("Qual é a largura da sua piramide? ")
    var largura = readln().toDouble()

    var area = altura * largura

    var area_pintada = area / 2

    print("$area_pintada")
}
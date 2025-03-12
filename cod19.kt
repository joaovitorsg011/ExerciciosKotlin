fun main() {
    println("Qual é o seu nome?")
    var nome = readln().toString()

    println("Qual é a sua primeira nota? ")
    var primeira_nota = readln().toDouble()

    println("Qual é a sua segunda nota? ")
    var segunda_nota = readln().toDouble()

    var media = (primeira_nota + segunda_nota) / 2

    println("A média do $nome ficou: $media")

    if (media >= 7) {
        print("$nome teve um bom aproveitamento")
    } else {
        print("$nome não teve um bom aproveitamento")
    }

}
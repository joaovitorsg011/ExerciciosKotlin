fun Media(nota1 : Double, nota2 : Double) {
    var media = (nota1+nota2)/2

    print("A média do aluno ficou $media")
}

fun main(){
    println("Digite a 1 Nota: ")
    var nota1 = readLine()!!.toDouble()

    println("Digite a 2 Nota: ")
    var nota2 = readLine()!!.toDouble()

    Media(nota1,nota2)
}
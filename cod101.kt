fun MediaAluno(nota1 : Double, nota2 : Double) {
    var media = (nota1+nota2)/2

    print("A média do aluno ficou $media")

    Situacao(media)
}

fun Situacao(media: Double) {
    if(media>6){
        print("\nAprovado")
    }else if(media<6 && media>4){
        print("\nRecuperação")
    }else{
        print("\nReprovado")
    }
}

fun main(){
    println("Digite a 1 Nota: ")
    var nota1 = readLine()!!.toDouble()

    println("Digite a 2 Nota: ")
    var nota2 = readLine()!!.toDouble()

    MediaAluno(nota1,nota2)
}
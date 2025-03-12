fun main(){
    println("Digite a primeira nota: ")
    var nota1 = readln().toDouble()

println("Digite a segunda nota: ")
    var nota2 = readln().toDouble()

    var media = (nota1+nota2)/2

    if (media <= 4.9){
        print("REPROVADO")
    }
    else if(media >= 5.0 && media <= 6.9){
        println("RECUPERAÇÃO")
    }
    else if(media >= 7.0) {
        print("APROVADO")
    }
}
fun main(){
    println("Digite um numero inteiro: ")
    var numero = readLine()!!.toInt()

    println("Digite um segundo número inteiro: ")
    var numero2 = readLine()!!.toInt()

    if(numero > numero2){
        print("$numero é maior que o $numero2")
    }
    else if(numero2 > numero){
        print("$numero2 é maior que o $numero")
    }
    else if(numero == numero2){
        print("Os dois são iguais")
    }


}
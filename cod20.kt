fun main(){
    println("Digite um número")
    var numero = readLine()!!.toInt()

    var  modulo = numero % 2

    if(modulo == 0){
        print("Seu número é par")
    }
    else{
        print("Seu numero é impar")
    }




}
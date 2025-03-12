fun main(){
    println("Qual a velocidade de um carro?")
    var velocidade_carro = readLine()!!.toDouble()

    if (velocidade_carro > 80){
        print("Voce foi multado")
        var multa = velocidade_carro * 5
        print("O valor da multa é $multa")
    }else{
        print("Voce não foi multado ")
    }


}
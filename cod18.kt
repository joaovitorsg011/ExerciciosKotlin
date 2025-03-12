fun main(){
    println("Qual é o seu ano de nascimento")
    var ano = readLine()!!.toInt()
    var ano_atual = 2025

    var idade = ano - ano_atual

    if (idade > 18){
        print("Voce pode votar")
    }
    else{
        print("Voce não pode votar")
    }
}
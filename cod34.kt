fun main(){
    println("Digite a sua altura: ")
    var altura = readLine()!!.toDouble()

    println("Digite o seu peso: ")
    var peso = readLine()!!.toDouble()

    var imc = peso / (altura * altura)

    if (imc < 18.5){
        print("Abaixo do Peso")
    }
    else if (imc >= 18.5 && imc <= 25){
        print("Peso Ideal")
    }
    else if(imc >= 25 && imc <= 30){
        print("Sobrepeso")
    }
    else if(imc >= 30 && imc <= 40) {
        print("Obesidade")

    }
    else if(imc > 40){
        print("Obesidade mórbida")
    }
}
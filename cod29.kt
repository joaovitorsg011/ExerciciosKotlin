fun main(){
    println("Digite o seu nome: ")
    var nome = readLine()!!.toString()

    println("Digite o seu salário: ")
    var salario = readLine()!!.toDouble()

    println("Digite quantos anos voce trabalha na empresa: ")
    var anos_trabalhados = readLine()!!.toInt()

    if(anos_trabalhados <= 3){
        var aumento = salario * 0.03
        var novoValor = salario + aumento

        print("Voce tem um aumento de 3% e ficou com o $novoValor de salario")
    }
    else if(anos_trabalhados >= 3 && anos_trabalhados <= 10){
        var aumento1 = salario * 0.125
        var novoValor1 = salario + aumento1

        print("Voce tem um aumento de 12.5% e ficou com o $novoValor1 de salario")
    }
    else if(anos_trabalhados >= 10){
        var aumento2 = salario * 0.20
        var novoValor2 = salario + aumento2


        print("Voce tem um aumento de 20% e ficou com o $novoValor2 de salario")

    }
}
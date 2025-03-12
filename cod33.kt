fun main(){
    println("Digite o valor da casa")
    var casa = readLine()!!.toDouble()

    println("Qual é o seu salario: ")
    var salario = readLine()!!.toDouble()

    println("Em quantos anos voce vai pagar? ")
    var anos = readln()!!.toInt()


    val meses = anos * 12


    val prestacaoMensal = casa / meses


    val limitePrestacao = salario * 0.30


    println("O valor da prestação mensal será R$ %.2f".format(prestacaoMensal))

    if (prestacaoMensal > limitePrestacao) {
        println("Empréstimo negado! A prestação excede 30% do seu salário.")
    } else {
        println("Empréstimo aprovado! A prestação está dentro do limite de 30% do seu salário.")
    }
}


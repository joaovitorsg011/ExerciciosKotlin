fun main(){
    println("Quantas horas de exercicio você realiza: ")
    var horas = readln()!!.toDouble()

    if(horas <= 10){
       var pontos = horas * 2
        var dinheiro = pontos * 0.05
        print("Voce ganhou por treinar até 10 horas: $pontos \n")
        print("Sua renda ficou $dinheiro")
    }
    else if(horas >= 10 && horas <= 20){
        var pontos2 = horas * 5
        var dinheiro2 = pontos2 * 0.05
        print("Voce ganhou por treinar de 10 até 20 horas: $pontos2 \n")
        print("Sua renda ficou $dinheiro2")
    }
    else if(horas > 20){
        var pontos3 = horas * 10
        print("Voce ganhou por treinar acima de 20h: $pontos3 \n")
        var dinheiro3 = pontos3 * 0.05
        print("Sua renda ficou $dinheiro3")
    }
}

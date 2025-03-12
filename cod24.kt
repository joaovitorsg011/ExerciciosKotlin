fun main(){
    println("Qual distancia voce deseja percorrer: ")
    var distancia = readLine()!!.toDouble()

    if(distancia <= 200){
        var cobranca = distancia * 0.50

        print("O valor da distancia ficou: $cobranca")

    if(distancia > 200){
        var cobranca_viagem = distancia * 0.45

        print("O valor da distancia ficou: $cobranca_viagem")
        }
    }
}
fun main() {
    var numero = 0
    var opc = 0
    var cont = 0
    var idade24mais = 0

    do {
        println("Qual é a sua idade: ")
        var idade = readLine()!!.toInt()
        cont++

        if(idade >= 21){
            idade24mais++
            print("Existe $idade24mais com mais de 21 anos")
        }

        var media = idade / cont

        print("\nA media entre as idades são: $media")

        println("\nVoce quer Continuar? ")
        var resp = readLine()!!.toString()

        if(resp == "não" || resp == "nao" || resp == "Não" || resp == "Nao") {
            opc = 1
        }

    } while (opc == 0)

    println("Acabou!")
}

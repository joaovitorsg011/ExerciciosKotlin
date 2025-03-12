fun main(){
    println("Digite a largura: ")
    var largura = readln().toDouble()

    println("Digite o comprimento: ")
    var comprimento = readln().toDouble()

    var area = largura * comprimento

    if(area < 100){
        print("Terreno Popular")
    }
    else if(area >= 100 && area < 500){
        print("Terreno Master")
    }
    else if(area > 500){
        print("Terreno VIP")
    }
}

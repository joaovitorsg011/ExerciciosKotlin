fun Maior(num1:Int, num2:Int, num3:Int){
    if(num1>num2 && num1>num3){
        print("$num1 é maior que $num2 e $num3")
    }
    else if(num2>num1 && num2>num3){
        print("$num2 é maior que $num1 e $num3")
    }
    else if(num3>num1 && num3>num2){
        print("$num3 é maior que $num1 e $num2")
    }
}

fun main(){
    println("Digite o primeiro numero: ")
    var num1 = readLine()!!.toInt()

    println("Digite o segundo numero: ")
    var num2 = readLine()!!.toInt()

    println("Digite o terceiro numero: ")
    var num3 = readLine()!!.toInt()

    Maior(num1, num2,num3)
}

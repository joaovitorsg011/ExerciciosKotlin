fun Maior(num : Int, num2 : Int){

    if(num > num2){
        print("$num é maior que $num2")
    }
    else if(num2 > num){
        print("$num2 é maior que $num")
    }
    else if(num == num2){
        print("$num é igual a $num2")
    }

}


fun main() {

    println("Digite um número: ")
    var num = readLine()!!.toInt()

    println("Digite um segundo número: ")
    var num2 = readLine()!!.toInt()

    Maior(num, num2)
}

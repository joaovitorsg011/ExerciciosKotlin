fun ParouImpar(num: Int){
    if(num % 2 == 0){
        print("Par")
    }else{
        print("Impar")
    }

}


fun main() {

    println("Digite um número: ")
    var num = readLine()!!.toInt()



        ParouImpar(num)
}

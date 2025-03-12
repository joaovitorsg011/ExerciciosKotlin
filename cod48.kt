fun main(){
    var soma = 0

    for(i in 1..7){
        println("Digite $i número")
        val numero = readLine()!!.toInt()
        soma += numero
    }

    println("A soma dos numeros é: $soma")
}
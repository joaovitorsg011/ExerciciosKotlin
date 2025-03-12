fun main(){

    for(i in 1..6){
        println("Digite $i número")
        val numero = readLine()!!.toInt()

        if (numero % 2 == 0) {
            println("O número $numero é PAR.")
        } else {
            println("O número $numero é ÍMPAR.")
        }
    }


}

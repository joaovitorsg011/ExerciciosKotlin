fun Contador(inicio : Int, fim : Int, incremento : Int ){

    var contador = inicio
    while (contador <= fim) {
        println(contador)
        contador += incremento
    }

}

fun main(){

    var inicio = 0
    println("Digite o Inicio: ")
    inicio = readLine()!!.toInt()

    println("Digite o Final: ")
    var fim = readLine()!!.toInt()

    println("Digite o Incremento: ")
    var incremento = readLine()!!.toInt()

    Contador(inicio,fim,incremento)
}
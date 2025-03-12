fun main() {
    
    println("Digite uma mensagem: ")
    val mensagem = readLine()!!.toString()

    Gerador(mensagem)
}

fun Gerador(mensagem: String) {

    println("+ ======= +")


    println(mensagem)


    println("+ ======= +")
}

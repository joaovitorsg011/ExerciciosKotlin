fun main() {
    var termo1 = 0
    var termo2 = 1

    println("Os 10 primeiros termos da sequência de Fibonacci são:")

    for (i in 1..10) {
        println(termo1)
        val proximoTermo = termo1 + termo2
        termo1 = termo2
        termo2 = proximoTermo
    }
}

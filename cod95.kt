fun Fibonacci(n: Int) {
    var a = 0
    var b = 1
    for (i in 1..n) {
        print("$b")
        if (i < n) {
            print(" >> ")
        }
        val temp = b
        b += a  // Calcula o próximo termo da sequência
        a = temp
    }
    println(" >> FIM")
}

fun main() {
    println("Digite quantos termos da sequência de Fibonacci você quer mostrar: ")
    val n = readLine()!!.toInt()

    Fibonacci(n)
}
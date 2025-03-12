fun main() {
    println("Digite um número: ")
    var numero = readLine()!!.toInt()
    var start = 1
    while (start <= numero) {
        print("$start ")
        start++
    }
}
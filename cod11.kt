fun main(){
    println("Digite o valor de A")
    var a = readln().toDouble()
    println("Digite o valor de B")
    var b = readln().toDouble()
    println("Digite o valor de C")
    var c = readln().toDouble()

    var delta = (b*b) - 4 * a * c

    print("$delta")
}
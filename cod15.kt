fun main(){
    println("Quantos dias voce trabalhou em um mes?")
    var dias_trabalhados = readln().toInt()

    var horas_trabalhados = dias_trabalhados * 8
    var horas_ganhas = horas_trabalhados * 25

    print("O salário total é: $horas_ganhas")



}
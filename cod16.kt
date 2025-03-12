fun main(){
    println("Qual a quantidade de cigarros fumados por dias")
    var quantidade_cigarros_dias = readLine()!!.toInt()

    println("Quantos anos ele já fumou")
    var quantidade_anos = readln().toInt()

    var dias_fumados = quantidade_anos * 365

    var tempo_por_cigarro = 10

    var cigarros_fumados = quantidade_cigarros_dias * dias_fumados

    var minutos_perdidos = cigarros_fumados * tempo_por_cigarro

    var dias_perdidos = minutos_perdidos / (60*24)

    print("Voce perdeu aproximadamento $dias_perdidos dias de vida")

}

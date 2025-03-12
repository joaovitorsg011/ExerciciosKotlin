fun main(){
    println("Digite uma distancia em metros")
    var metros = readln().toDouble()

    var dm = metros * 10
    var cm = dm * 10
    var mm = cm * 10
    var dam = metros / 10
    var hm = dam / 10
    var km = hm / 10

    print("$metros metros\n ")
    print("$dm dm\n")
    print("$cm cm\n")
    print("$mm mm\n")
    print("$dam dam\n" )
    print("$hm hm\n")
    print("$km km\n")


}
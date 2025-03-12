fun main() {

    println("Escolha uma linha: 1 | 2 | 3")
    val num = readLine()!!.toInt()

    GeradorPortugolStudio(num)
}



fun GeradorPortugolStudio(num: Int) {

    var linha1 = "+-------=======------+"
    var linha2 = "~~~~~~~~:::::::~~~~~~~"
    var linha3 = "<<<<<<<<------->>>>>>>"

    if(num == 1){
        print(linha1)

        for (i in 0..4) {
            println("\nPortugol\nStudio")
        }

        print(linha1)
    }

    if(num == 2){
        print(linha2)

        for (i in 0..4) {
            println("\nPortugol\nStudio")
        }

        print(linha2)
    }

    if(num == 3){
        print(linha3)

        for (i in 0..4) {
            println("\nPortugol\nStudio")
        }

        print(linha3)
    }




}

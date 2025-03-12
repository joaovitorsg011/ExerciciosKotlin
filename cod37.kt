fun main() {

    println("Digite o salário atual do funcionário:")
    val salarioAtual = readLine()!!.toDouble()


    println("Digite o gênero do funcionário (Masculino/Feminino):")
    val genero = readLine()!!.capitalize()


    println("Há quantos anos o funcionário trabalha na empresa?")
    val anosDeEmpresa = readLine()!!.toInt()


    var aumentoPercentual = 0.0
    var novoSalario = salarioAtual


    if (genero == "Feminino") {
        if (anosDeEmpresa < 15) {
            aumentoPercentual = 5.0
        } else if (anosDeEmpresa in 15..20) {
            aumentoPercentual = 12.0
        } else if (anosDeEmpresa > 20) {
            aumentoPercentual = 23.0
        }
    } else if (genero == "Masculino") {
        if (anosDeEmpresa < 20) {
            aumentoPercentual = 3.0
        } else if (anosDeEmpresa in 20..30) {
            aumentoPercentual = 13.0
        } else if (anosDeEmpresa > 30) {
            aumentoPercentual = 25.0
        }
    } else {
        println("Gênero inválido. Por favor, insira 'Masculino' ou 'Feminino'.")
        return
    }


    novoSalario = salarioAtual + (salarioAtual * aumentoPercentual / 100)

    println("Aumento de $aumentoPercentual% aplicado.")
    println("Novo salário: R$ %.2f".format(novoSalario))
}

fun main() {
    val nomes = Array(5) { "" }
    val sexos = Array(5) { "" }
    val salarios = DoubleArray(5)


    for (i in 0 until 5) {
        print("Digite o nome do funcionário ${i + 1}: ")
        nomes[i] = readLine()!!.toString()

        print("Digite o sexo do funcionário ${i + 1} (M para masculino, F para feminino): ")
        sexos[i] = readLine()!!.toString()

        print("Digite o salário do funcionário ${i + 1}: R$ ")
        salarios[i] = readLine()!!.toDouble()
    }


    println("\nFuncionárias mulheres que ganham mais de R$5.000:")
    for (i in 0 until 5) {
        if (sexos[i].equals("F", ignoreCase = true) && salarios[i] > 5000) {
            println("Nome: ${nomes[i]}, Sexo: ${sexos[i]}, Salário: R$ ${salarios[i]}")
        }
    }
}

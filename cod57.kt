fun main(){

    var opc = 0
    var soma = 0.0
    var soma_fem = 0.0

    while(opc == 0) {

        println("\nDigite o seu sexo: Masculino | Feminino ")
        var sexo = readLine()!!.toString()

        if(sexo != "Masculino" && sexo != "Feminino"){
            print("Selecione uma opção valida")
            continue
        }

        if(sexo == "Masculino"){
            println("Digite o seu salario: ")
            var salario_masc = readLine()!!.toDouble()

            soma += salario_masc

            println("Voce deseja continuar? Sim | Não")
            var resp = readLine()!!.toString()

            if(resp == "Não"){
                opc = 1
                print("O programa terminou\n")
            }

            print("A soma dos salarios é: $soma")

        }
        else if(sexo == "Feminino"){
            println("Digite o seu salario: ")
            var salario_fem = readLine()!!.toDouble()

            soma_fem += salario_fem

            println("Voce deseja continuar? Sim | Não")
            var resp = readLine()!!.toString()

            if(resp == "Não"){
                opc = 1
                print("O programa terminou\n")
            }

            print("A soma dos salarios é: $soma_fem \n")
        }
    }

}

fun main(){
    var opc = 0
    var soma = 0

    print("Caso deseja parar o programa escreva 1111 \n/")

    while(opc == 0){

        println("Digite um número: ")
        var num = readLine()!!.toInt()

        if(num == null){
            print("Digite um numero valido")
            continue
        }
        if(num == 1111){
            opc = 1
        }else{
            soma += num
        }





    }

    print("O somatorio dos numeros digitados é: $soma")
}
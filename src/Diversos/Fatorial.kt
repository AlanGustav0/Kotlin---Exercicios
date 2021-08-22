package Diversos

fun main(){

    print("Digita o valor que deseja calcular o fatorial: ")
    var fatorial = readLine()!!.toInt()
    var resultado = 1
    for(fator in 1..fatorial){
        resultado *= fator
    }
    print("O fatorial de ${fatorial} é: %d".format(resultado))
}
package Diversos
/*
Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
 */
fun main(){

    for(numero in 1..101){
        if(numero % 3 == 0){
            print(numero)
            print(" ")
        }
    }
}
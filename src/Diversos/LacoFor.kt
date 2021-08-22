package Diversos

fun main(){

    for(linha in 0..5){
        for(coluna in 0..5){
            if(coluna >= linha){
                break
            }
            print(coluna + 1)
        }
        println()
    }
}
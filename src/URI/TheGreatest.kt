package URI

import java.lang.Math.abs


fun main(){

    var valores = readLine()!!.split(" ")

    var A = valores[0].toInt()
    var B = valores[1].toInt()
    var C = valores[2].toInt()

    var maior = C

    var maiorAB = ((A+B+abs(A-B)) / 2)

    val resultado = if(maiorAB > maior) maiorAB else maior

    print("${resultado} eh o maior\n")
}
package URI

import kotlin.math.pow

fun main(){

    val n = 3.14159

    var R = readLine()!!.toDouble()
    var A = n * R.pow(2.0)

    print("A=%.4f\n".format(A).replace(",","."))

}
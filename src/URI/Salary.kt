package URI

import java.util.*

fun main(){

    Locale.setDefault(Locale.US)

    val employeeNumber = readLine()!!
    var hoursNumber = readLine()!!.toDouble()
    var valuePerHour = readLine()!!.toDouble()

    var salary = valuePerHour * hoursNumber

    print("NUMBER = ${employeeNumber}\nSALARY = U$ ${String.format("%.2f", salary)}\n")

}
package URI

fun main(){

    var A = readLine()!!.toDouble()
    var B = readLine()!!.toDouble()
    var C = readLine()!!.toDouble()

    val media = ((A * 2) + (B * 3) + (C * 5)) / 10

    print("MEDIA = %.1f\n".format(media).replace(",","."))
}
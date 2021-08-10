

fun main() {

	var A = readLine()!!.toDouble()
	var B = readLine()!!.toDouble()
	
	var media = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5)
	
	print("MEDIA = %.5f\n".format(media).replace(",","."))
	
}


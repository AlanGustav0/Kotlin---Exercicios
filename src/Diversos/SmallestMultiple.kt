fun main() {

    val go: Boolean = true
    var number: Int = 1
    var sum = 0

    while (go) {

        for (value in 1..20) {
            if (value % number == 0) {
                sum++;
            }
        }

        if (sum == 20) {
            print(number)
            break;
        }

    }
}
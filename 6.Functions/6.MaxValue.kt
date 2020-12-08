


fun maxValue(x: Int, y: Int): Int {
    if (x > y) {
        return x
    } else {
        return y
    }
}

fun main(args: Array<String>) {
    println("The largest number is: ${maxValue(4, 8)}")
}
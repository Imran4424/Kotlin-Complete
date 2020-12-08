

fun main(args: Array<String>) {
    // taking int input from console
    val number: Int = readLine()!!.toInt()

    // WHILE LOOP
    // kotlin while loop is similar to java while loop

    var i: Int = 1
    while (i <= number) {
        println(i)
        i++
    }
}


fun main(args: Array<String>) {
    // taking int input from console
    val number: Int = readLine()!!.toInt()

    // DO WHILE LOOP
    // kotlin do while loop is similar to java do while loop

    var i: Int = 1
    do {
        println(i)
        i++
    } while (i <= number)
}
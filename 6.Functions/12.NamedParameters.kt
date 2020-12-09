
/*
* function
* Named parameters
*
* in named parameters order of the variable doesn't matter at all
* */

fun volume(length: Int = 10, width: Int = 5, height: Int = 15) {
    println("Length is $length")
    println("Width is $width")
    println("Height is $height")
    println()
}

fun main(args: Array<String>) {
    volume()
    volume(length = 8)
    volume(width = 12)
    volume(height = 12)
    volume(length = 5, width = 3)
    volume(width = 3, length = 5)
    volume(length = 12, height = 15, width = 7)
    volume(height = 20, length = 12, width = 7)
}
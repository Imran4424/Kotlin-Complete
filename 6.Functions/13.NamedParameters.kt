
/*
* function
* Named parameters
*
* in named parameters order of the variable doesn't matter at all
* */

fun volume(length: Int, width: Int, height: Int) {
    println("Length is $length")
    println("Width is $width")
    println("Height is $height")
    println()
}

fun main(args: Array<String>) {
    volume(length = 12, width = 7, height = 15)
    volume(length = 12, height = 15, width = 7)
    volume(height = 20, length = 12, width = 7)
    volume(height = 20, width = 7, length = 12)
}
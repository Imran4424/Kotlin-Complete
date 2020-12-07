
/*
* this is kotlin main function like java main
* kotlin function start with fun keyword
* unlike java kotlin language argument label comes first then the data type (like swift)
*
* like swift, kotlin function return type comes after the argument list
* example
*   fun add(a: Int, b: Int): Int {
*       return a + b
*   }
* */
fun main(args: Array<String>) {
    // Like system.out.println()
    // kotlin has println
    println("I am a programmer")

    // Like system.out.println()
    // kotlin has print
    print("My name is")
    print("Imran\n")

    println(3 + 7)

    // string concatenation
    println("My bill is " + 3 + 7)

    // string interpolation
    println("My bill is " + (3 + 7))
}
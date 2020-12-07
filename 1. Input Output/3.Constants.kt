

fun main(args: Array<String>) {

    // constant declaration
    // constant type will determined by the value provided in initialization
    // following underscores is for improve readability
    // kotlin compiler will ignore it
    val lightSpeed = 3_000_000

    println("The light speed is $lightSpeed")

    // this will generate an error cause value changing in constant not allowed
//    lightSpeed = 305

    //  another way to declare constant
    val anotherConstant: Int
    anotherConstant = 25

    // this will generate error
//    anotherConstant = 28

    // one more way to declare constant
    val constantThree: Int = 25
}
// 0 1 1 2 3 5 8 13 21 34 55 89...

import sun.security.util.Length
import java.math.BigInteger

/*
* Class
* */


fun main(args: Array<String>) {
    // class variable declaration
    var box: Box = Box(10, 12, 20)

    /*
    * the following lines showing error
    * now there is no property class
    * just primary constructor parameter in class
    * which is only accessible within init
    * */
//    box.length = 10
//    box.width = 12
//    box.height = 20

    println("Box area is: ${box.area()}")
    println("Box volume is: ${box.volume()}")
}

// class declaration
/*
* Here, we are passing some parameters with Box class name ( i hate this part of the language)
* this is call primary constructor
*
* passing parameters through primary can only be accessible through init
* if we try to access the parameters from other parts of the class that will show error
* */

class Box(length: Int, width: Int, height: Int) {
    // class property declaration
//    var length: Int = 0
//    var width: Int = 0
//    var height: Int = 0

    init {
        println("Length $length")
        println("Width $width")
        println("Height $height")
    }

    // class method declaration
    fun area(): Int {
        /*
        * the following lines showing error
        * now there is no property class
        * just primary constructor parameter in class
        * which is only accessible within init
        * */
        // return  length * width
        return  0
    }

    // class method declaration
    fun volume(): Int {
        /*
        * the following lines showing error
        * now there is no property class
        * just primary constructor parameter in class
        * which is only accessible within init
        * */
        // return  length * width * height
        return 0
    }
}



/*
* Class
* */


fun main(args: Array<String>) {
    // class variable declaration
    var box: Box = Box(10, 12, 20)

    /*
    * the following lines will access the property of the class not parameters
    * */
    box.length = 2
    box.width = 2
    box.height = 2

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
    var length: Int = 0
    var width: Int = 0
    var height: Int = 0

    // init function can access both property and constructor parameter
    init {
        // init block
        // differentiate between property and parameters by using this keyword
        // without this keyword, init will prioritize constructor parameter in case same name property & parameter
        // and will reference to constructor parameter
        this.length = length
        this.width = width
        this.height = height

        // accessing constructor parameter values
        println("Length $length")
        println("Width $width")
        println("Height $height")
    }

    // class method declaration
    fun area(): Int {
        /*
        * the following lines will show the property value of the class not parameters
        * */
        println("---area called---")
        println("Length $length")
        println("Width $width")

        return  length * width
    }

    // class method declaration
    fun volume(): Int {
        /*
        * the following lines will show the property value of the class not parameters
        * */
        println("---volume called---")
        println("Length $length")
        println("Width $width")
        println("Height $height")

        return  length * width * height
    }
}

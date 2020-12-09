

/*
* Class
* */


fun main(args: Array<String>) {
    var box: Box = Box()

    box.length = 10
    box.width = 12
    box.height = 20

    println("Box area is: ${box.area()}")
    println("Box volume is: ${box.volume()}")
}

class Box {
    var length: Int = 0
    var width: Int = 0
    var height: Int = 0

    fun area(): Int {
        return  length * width
    }

    fun volume(): Int {
        return  length * width * height
    }
}

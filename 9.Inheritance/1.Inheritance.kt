


/*
* Inheritance
* */


fun main(args: Array<String>) {

}

class Animal {
    var color: String = ""

    fun eat(food: String) {
        println("Eating $food")
    }
}

/*
* error showing
* This type is final, so it cannot be inherited from
* This type has a constructor, and thus must be initialized here
* */
class Dog: Animal {
    var breed:String = ""

    fun bark() {
        println("Bark")
    }
}

/*
* error showing
* This type is final, so it cannot be inherited from
* This type has a constructor, and thus must be initialized here
* */
class Cat: Animal {
    var age: Int = 0

    fun meow() {
        println("Meow")
    }
}
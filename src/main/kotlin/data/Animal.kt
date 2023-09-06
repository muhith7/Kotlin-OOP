package data

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat: Animal() {
    override val name: String = "Milly"
    override fun run(){
        println("You are funny cat milly")
    }
}

class Dog: Animal(){
    override val name: String = "Cihuahua"
    override fun run() {
        println("You are funny dog")
    }

}
package data

interface Interaction {
    val name: String
    fun SayHello(name: String)
}

class Human(override val name: String): Interaction{
    override fun SayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }
}
package data

interface Interaction {
    val name: String
    fun SayHello(name: String)
}

interface MoveA{
    fun move(){
        println("Move Please A") // Concrete Function
    }
}

interface MoveB{
    fun move(){
        println("Move Please B") // Concrete Function
    }
}

class Human(override val name: String): Interaction, MoveA, MoveB{
    override fun SayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }

    override fun move() {
        super<MoveA>.move()
        println("Move move function")
    }
}


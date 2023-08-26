package data

open class Shape {
    open val corner: Int = -1
    open fun printName(){
        println("This is Shape")
    }
}
//Shape Super dari Retangle
class Retangle: Shape(){
    override val corner: Int = 4
    val parentCorner: Int = super.corner
    override fun printName() {
        println("This is Retangle")
        super.printName()
    }
}
//disini Shape Super dari Triangle
open class Triangle: Shape(){
    override val corner: Int = 3
}
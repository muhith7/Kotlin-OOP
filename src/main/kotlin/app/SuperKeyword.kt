package app

import data.Retangle

//Super keyword merupakan kata yang bisa digunakan untuk memanggil properties parent ke dalam properties Child.
//Tidak hanya itu Super juga bisa digunakan untuk memanggil function paren ke dalam function child
fun main() {
    val retangle = Retangle()

    println("Corner = ${retangle.corner}")
    println("Parent Corner = ${retangle.parentCorner}")

    retangle.printName()
}
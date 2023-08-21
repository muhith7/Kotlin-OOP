package app

import data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Eko"

    val abdul = Person()
    abdul.firstName = "Abdul"

    val muhith = Person()
    muhith.firstName = "Muhith"

    println(eko.firstName)
    println(abdul.firstName)
    println(muhith.firstName)
}
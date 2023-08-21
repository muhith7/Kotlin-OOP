package app

import data.Car

//Constructor merupakan paramaeter pada class, dimana ketika kita membuat object baru maka constructor yang pertama kali yang harus di eksekusi
fun main() {
    val toyota = Car("Evolution")

    val honda = Car("Civic","Type R")

    println(toyota.brand)
    println(toyota.year)
    println(honda.brand)
    println(honda.year)
}
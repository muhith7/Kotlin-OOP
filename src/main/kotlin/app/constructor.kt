package app

import data.Car

//Constructor merupakan paramaeter pada class, dimana ketika kita membuat object baru maka constructor yang pertama kali yang harus di eksekusi
fun main() {
    val toyota = Car("Evolution Lancer X", 2015)

    val honda = Car("Civic Type R", 2022)

    println(toyota.brand)
    println(toyota.year)
    println(honda.brand)
    println(honda.year)
}
package app

import data.Manager
import data.VicePresident

//Inhritance (Pewarisan) dimana class parent mewariskan ke child class
//Class parent dapat diwariskan ke banyak child tetapi child hanya dapat diwarsikan oleh 1 parent saja
//Default class pada kotlin adalah Final dimana Final merupakan child class untuk menjadikannya parent cukup menambahkan (open) sebelum (class)
fun main() {
    val manager = Manager("Abdul")
    manager.sayHello("Budi")

    val vicePresident = VicePresident("Abdul")
    vicePresident.sayHello("Budi Hartono")
}
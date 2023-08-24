package app

import data.Person

//This digunakan ketika function didalam class object memiliki parameter/constructor yang sama
//jadi this untuk menunjukan atau mengarahkan bahwa properties yang disebut adalah milik si object class tersebut
fun main() {
    val muhith = Person()
    muhith.firstName = "Abdul"

    muhith.sayHello("Budi","hartono")
}
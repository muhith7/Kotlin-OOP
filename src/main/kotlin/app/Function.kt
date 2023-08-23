package app

import data.Person

fun main() {
    val muhith = Person()

    muhith.firstName = "Abdul"
    muhith.middleName = "Muhith"
    muhith.lastName = "Nawawi"

    muhith.sayHello("Eko")
    muhith.run()

    val fullName = muhith.getFullName() //Menggunakan variable karena nilai kembalian function nya String
    println(fullName)
}
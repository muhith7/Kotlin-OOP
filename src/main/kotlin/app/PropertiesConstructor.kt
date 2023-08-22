package app

import data.User

//Properties dalam constructor dimana bisa dilakukan di primary constructor saja

fun main() {
    var user1 = User ("muhith","rahasia123")
    var user2 = User ("abdul", "rahasiasekali")

    user1.password = "muhith393993"
    user1.username = "miuhiiit"

    //Properties var maka dapat diubah

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}
package app

import data.Student
import data.sayHello

fun main() {
    val student: Student? = Student("Muhith",20)
    student.sayHello("Loki")
}
package app

import data.SuperTeacher
import data.Teacher

fun main() {
    val teacher = SuperTeacher("Muhith")

   // teacher.teach() error karena funtion teach private
    println(teacher.name)

    teacher.test()


}
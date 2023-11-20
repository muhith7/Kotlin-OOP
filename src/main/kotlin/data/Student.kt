package data
//Extensions Function

class Student(val name: String, val age: Int)

fun Student?.sayHello(name: String){
    if (this != null) {
        println("Hallo $name, my name is ${this.name} and my age is ${this.age}" )
    }

}
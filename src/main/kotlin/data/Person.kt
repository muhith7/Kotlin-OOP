package data

class Person {
    var firstName: String = ""
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String){
        println("Hello $name, my name is $firstName")
    }

    //Function OverLoading
    fun sayHello(name: Int){
        println("Hallo Number Jersey $name,my name is $firstName")
    }

    fun sayHello(firstNameParam: String, lastNameParam: String){
        println("Hello $firstNameParam $lastNameParam, my name is $firstName")
    }
    fun run(){
        println("I'm Run")
    }

    fun getFullName(): String{
        return "$firstName $middleName $lastName"
    }
}
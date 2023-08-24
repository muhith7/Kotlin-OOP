package app

import data.Person


//Function Overloading adalah function dengan nama yang sama didalam satu class
//Ini dapat dilakukan dengan beberapa ketentuan pembeda yaitu dengan jumlah parameter yang berbeda,
//atau jika mungkin jumlah parameter yang sama harus jenis data yang berbeda semisal (name: String) -> (name: Int)
fun main() {
    val muhith = Person ()
    muhith.firstName = "Abdul"

    muhith.sayHello("Budi")
    muhith.sayHello(10)
    muhith.sayHello("Budi","hartono")
}
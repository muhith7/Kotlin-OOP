package app

import data.Laptop
import data.SmartPhone

fun printObject(any: Any){
    if (any is Laptop){
        println("Laptop with name ${any.name}")
    }else if (any is SmartPhone){
        println("SmartPhone with name ${any.name}")
    }else{
        println(any)
    }
}

fun printObjectWithWhen(any: Any){
    when(any){
        is Laptop -> println("Laptop with name ${any.name}")
        is SmartPhone -> println("SmartPhone with name ${any.name}")
        else -> (println(any))
    }
}


//Unsafe Cast

fun printUnsafe(any: Any){
    val value = any as String
    println(value)
}

//Safe Nullabel Cast
fun printSafeNullabel(any: Any){
    val value: String? = any as? String
    println(value)
}
fun main() {
    printUnsafe("Muhith")
    // printUnsafe(1) Terjadi ClassCastException Karena parameter any telah dikonversi paksa ke tipe data String sedangkan Any dapat menggunakan tipe data apapun.

    printSafeNullabel("Muhith Safe")
   // printSafeNullabel(1) Tidak terjadi error namun output nya akan null karena inputnya bukan data yang ingin di konversi.


    printObjectWithWhen("Laptop" )
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Legion"))
    printObjectWithWhen(SmartPhone("Xiaomi"))
}
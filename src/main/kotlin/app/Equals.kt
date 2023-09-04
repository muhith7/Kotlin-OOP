package app

import data.Company
//Equals Function
fun main() {
    val company1 = Company("Plugin")
    val company2 = Company("Plugin")

    println(company1 == company2)
    println(company1 == company1)


}
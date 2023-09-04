package app

import data.Company

fun main() {
    val company1 = Company("Plugin")
    val company2 = Company("Plugin")

    println(company1.hashCode() == company2.hashCode())
    println(company1.hashCode() == company1.hashCode())

    println(company1.hashCode())
    println(company2.hashCode())
}
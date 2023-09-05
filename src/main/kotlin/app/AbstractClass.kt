package app

import data.City
import data.Country
import data.Location

fun main() {
    val city = City("Tegal")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}
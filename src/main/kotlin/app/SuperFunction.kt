package app

import data.Customer
import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer ("Abdul",2000000)
    println("Customer ${premiumCustomer.name}, Dengan saldo = ${premiumCustomer.balance}")

    val executiveCustomer = ExecutiveCustomer("Muhith",10000000)
    println("Customer Executive ${executiveCustomer.name}, Dengan saldo = ${executiveCustomer.balance}")
}
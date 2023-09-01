package data

class Laptop (val name: String)

open class SmartPhone(val name: String)

class HandPhone(name: String, val os: String) : SmartPhone(name)
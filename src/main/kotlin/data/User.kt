package data


//Properties dalam constructor dimana bisa dilakukan di primary constructor saja
class User (var username: String,var password: String) {

    //toString
    override fun toString(): String {
        return "User with username = $username"
    }

}
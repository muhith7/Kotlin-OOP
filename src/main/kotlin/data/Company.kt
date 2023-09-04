package data


//Override equals Function
class Company(var name: String){
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> other.name == this.name
            else -> false
        }
    }
}
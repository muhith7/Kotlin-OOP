package data


//Override equals Function
class Company(var name: String){
    //HashCode Override
    override fun hashCode(): Int {
        return name.hashCode()
    }
    //Equals Override
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> other.name == this.name
            else -> false
        }
    }
}
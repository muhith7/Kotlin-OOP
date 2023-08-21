package data

class Car(paramBrand: String, paramTipe: String, paramYear: Int = 2020){

    //Initializer Block merupakan program yang bisa ditambahkan dalam class untuk dieksekusi setelah consturctor dijalankan
    //Jangan pernah membuat program initializer yang kompleks karena akan memberatkan jalannya class , buatlah yang simple jika tidak perlu makan jnagan dibuat
    init {
        println("Produk $paramBrand ini dibuat pada tahun $paramYear")
    }

    //Secondary Constructor
    //Constructor 2 this -> Constructor 1 -> Car
    constructor(paramBrand: String,paramTipe: String): this (paramBrand,paramTipe,2020){
        println("Secondary Constructor 1")
    }

    constructor(paramBrand: String): this (paramBrand, ""){
        println("Secondary Constructor 2")
    }

    var brand: String = paramBrand
    var tipe: String = paramTipe
    var year: Int = paramYear
}
//Jika ingin membuat nilai default pada properti lebih baik menggunakan constructor agar lebih mudah merubahnya dalam object
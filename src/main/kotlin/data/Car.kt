package data

class Car(paramBrand: String, paramYear: Int = 2020){

    //Initializer Block merupakan program yang bisa ditambahkan dalam class untuk dieksekusi setelah consturctor dijalankan
    //Jangan pernah membuat program initializer yang kompleks karena akan memberatkan jalannya class , buatlah yang simple jika tidak perlu makan jnagan dibuat
    init {
        println("Produk $paramBrand ini dibuat pada tahun $paramYear")
    }

    var brand: String = paramBrand
    var year: Int = paramYear
}
//Jika ingin membuat nilai default pada properti lebih baik menggunakan constructor agar lebih mudah merubahnya dalam object
<h2 align="center">Kotlin Object Oriented Programming</h2>
<p align="center"><img src="https://developer.android.com/static/images/cluster-illustrations/kotlin-hero.svg" alt="" width="750" height="300"></p>

`Note: When an object of the class is created, it has access to all of the class functions.`


**Function Overriding :**

`Function Overriding merupakan sebuah cara dalam inheritance (Pewarisan) dimana sebuah function didalam class parent dapat dirubah didalam class child, dengan kata kunci (open) karena default sebuah function didalam class merupakan final.`


**Final Override Function :**

`Saat kita membuat ulang sebuah function di class child secara default function tersebut ber-Sifat open dimana berarti function tersebut dapat dibuat ulang lagi oleh class child di bawahnya `

`jika tidak ingin function yang dibuat ulang dipakai class child dibawahnya makan harus ditambahkan kata kunci (final) didepan (override)`

**Super Keyword**

`Super keyword sama halnya dengan this yang menyatakan properties di class tersebut, sedangkan keyword super digunakan untuk mengakses function atau properties parent class didalam child class, contohnya {super.(function/properties)}.`


**Super Constructor**

`Sama seperti sebelumnya keyword super juga bisa digunakan pada constructor, dimana ini berguna untuk memanggil atau menggunakan ulang constructor Class Parent kepada Class Child, Namun class child tidak bisa menggunakan primary constructor jika ingin menggunakan super keyword, Jika ingin menggunakan primary constructor maka tidak perlu lagi menggunakan super keyword`

**Any Class**

`Any Class merupakan default parent sebuah class dalam kotlin, Dimana ketika kita membuat class yang tidak memiliki extend (:) maka secara default class tersebut sebuah child dari Any Class (Super Class), dan jika Class Child memiliki Class Prent, Class Parent tersebut juga memilik default parent Any Class.`

**Type Check & Cast**

`Sesuai dengan namanya Type Check & Cast Metode ini digunakan untuk meng-check Type data dan meng-Konversi ke tipe data lainnya secara generik menggukan tipe data Any.`

**Unsafe Cast**

`Kotlin juga mendukung konversi tipe data secara paksa menggunakan keyword (as), Namun metode ini tidak aman jika tipe data-nya ternyata tidak sesuai.`

**Safe Nullable Cast**

`Namun kotlin juga dapat mengganti paksa tipe data dengan aman menggunakan metode nullable dimana keyword yang di gunakan adalah "as?" ketika hasil yang dikeluarkan tidak sesuai dengan tipe data yang di inginkan maka tidak akan terjadi error, tetapi akan null.(More Safe)`

**toString() Function**

`toSting() merupakan salah satu funtion yang dimiliki oleh superclass Any, toString merupakan representasi String dari object, Standarnya toString() akan mengembalikan referensi kode unik ketika kita lakukan println, kita bisa meng-Override function toString() jika ingin mengubah representasi dari String pada object yang kita miliki`

**equals Function**

`Di kotlin, Semua object bisa dibandingkan menggunakan operasi "==" atau "!=", Saat membandingkan objek menggunakan operasi tersebut sebenarnya koltin akan menggunkan function equals() milik class super Any, Untuk mengubah cara membandingkannya kita bisa meng-override equals milik class Any.`

**hasCode Function**

`hashCode merupakan function yang dimiliki oleh super class Any, dimana funtion tersebut digunakan untuk meng-representasikan number sebuah object, Salah satu penggunaan yang banyak digunakan adalah di struktur data, misal untuk memastikan tidak ada data yang di duplicate,agar lebih mudah cek di nilai hashCode-nya, Jika hashCode sama maka objectnya dianggap sama.` 

**Abstract Class**

`Abstract Class merupakan class yang dibuat untuk diturunkan untuk class lain, ketika membuat class abstract kita tidak perlu men-definisikan kelas tersebut open karena secara langsung abstract menjadi open atau bisa diturunkan langsung kekelas lainya.`

**Abstract Properties & Function**

`Abstract Properties & Function merupakan Properties dan Function yang wajib di override ke class child dimana Abstract Properties dan Function tidak perlu di-insialisasikan value dan blok kode-nya diwajibkan hanya di subclass atau class child-nya`
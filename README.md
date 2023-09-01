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

`Any Class merupakan default parent sebuah class dalam kotlin, Dimana ketika kita membuat class yang tidak memiliki extend (:) maka secara default class tersebuh sebuah child dari Any Class (Super Class), dan jika Class Child memiliki Class Prent, Class Parent tersebut juga memilik default parent Any Class`
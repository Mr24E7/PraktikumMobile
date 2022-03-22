package Modul1

class Olahraga {
    val nama:String = "Sepak Bola"
    val pemain:String = "11 Orang"

    fun teknik1(){
        println("Dribbling")
    }
    fun teknik2(){
        println("Shooting")
    }
    fun teknik3(){
        println("Passing")
    }
    fun teknik4(){
        println("Heading")
    }
    fun teknik5(){
        println("Intercepting")
    }

}
fun main() {
    val a = Olahraga()
    a.nama
    println("Nama Olahraga: ${a.nama}")
    a.pemain
    println("Jumlah Pemain: ${a.pemain} ")
    println("Kumpulan Teknik Dasar Sepak Bola:")
    a.teknik1()
    a.teknik2()
    a.teknik3()
    a.teknik4()
    a.teknik5()
}



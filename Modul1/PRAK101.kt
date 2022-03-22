package Modul1

import java.util.concurrent.ThreadLocalRandom

fun main() {
println("Soal 1")
    print("Waktu Sekarang: ")
    val A = readLine()
    print("Nama Anda: ")
    val B = readLine()
    print("Umur Anda: ")
    val C: Int = Integer.valueOf(readLine())
    print("Suhu Anda: ")
    val E: Double = ThreadLocalRandom.current().nextInt(35, 37).toDouble()
    val D = """
    nama: $A
    usia: $B tahun
    alamat: $C

    Selamat $A, $B. Umur anda $C Tahun.
    Suhu Tubuh anda $E derajat Celcius.
    """.trimIndent()
    println(D) }
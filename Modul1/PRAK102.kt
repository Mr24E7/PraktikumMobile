package Modul1
fun main() {
println("Soal 2")
    val number1 = 2
    println("Nilai X:")
    val number2: Int = Integer.valueOf(readLine())
    val number3 = 5
    val number4 = 8
    val result: Double

    result = (number1 * number2 * number2 + number3 * number2 - number4).toDouble()
    println("Hasil = $result") }
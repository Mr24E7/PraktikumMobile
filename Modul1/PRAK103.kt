package Modul1

fun main() {
    print("Input Bilangan : ")
    var x:Int = Integer.valueOf(readLine())
    val a = x
    var b = 5
    for (i in 1..b){
        if (x % 2 == 0 || x % 3 == 0) {
            print(x)
            print(" ")
            x += a
        } else {
            x += a
            b += 1
        }
    }
}

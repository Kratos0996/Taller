fun isPrime(number: Int): Boolean {
    if (number < 2) return false

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}

fun factorial(number: Int) {
    var num = 1

    for (i in 2..number) {
        num *= i
    }

    println("El factorial de $number es $num")
}

fun isEven(number: Int) {
    if (number % 2 == 0) {
        println("$number es par")
    } else {
        println("$number es impar")
    }
}

fun main() {
    print("Ingrese un numero entero: ")
    val number = readln().toInt()

    if (isPrime(number)) {
        println("$number es primo")
    } else {
        println("$number no es primo")
    }

    factorial(number)
    isEven(number)
}
fun main() {
    val lista = mutableListOf<Double>()
    val par = mutableListOf<Double>()
    val impar = mutableSetOf<Double>()
    print("Ingrese diez numeros enteros: ")
    for (i in 1..10) {
        println("Ingrese el $i: ")
        val num = readln().toDouble()
        lista.add(num)
        if (num % 2 == 0.0) {
            par.add(num)
        } else {
            impar.add(num)
        }
    }
    println("La lista es $lista")
    val suma = lista.sum()
    println("Suma de los elementos de la lista: $suma")
    val promedio = suma/10
    println("Promedio de la lista: $promedio")
    val max = lista.max()
    println("el numero mayor de la lista es: $max")
    val min = lista.min()
    println("el numero menor de la lista es: $min")

    val can1 = par.size
    println("la cantidad de numeros pares es: $can1")
    val can2 = impar.size
    println("la cantidad de numeros impares: $can2")

}
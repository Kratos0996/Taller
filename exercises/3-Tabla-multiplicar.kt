fun main () {
    print("Ingrese un numero entero:")
    val num = readln().trim().toInt()
    val tabla = mutableListOf<Int>()

    for (i in 1..10) {
       val resultado = i * num
        tabla.add(resultado)
        println("$num x $i = $resultado")
    }
    val total = tabla.sum()
    println("Suma de todos los resultados: $total")
}
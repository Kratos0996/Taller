fun main() {
    print("Ingrese la operacion que desea realizar (suma, resta, multiplicacion o division): ")
    val operacion = readln().lowercase()

    print("Ingrese el primer numero: ")
    val num1 = readln().toDouble()

    print("Ingrese el segundo numero: ")
    val num2 = readln().toDouble()

    val resultado = when (operacion) {
        "suma" -> num1 + num2
        "resta" -> num1 - num2
        "multiplicacion" -> num1 * num2
        "division" -> if (num2 != 0.0) num1 / num2 else "Error: División por cero"
        else -> "Operación no válida"
    }

    println("Resultado: $resultado")
}
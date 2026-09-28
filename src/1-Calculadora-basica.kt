fun main() {
    var num1 = 0.0
    var num2 = 0.0
    var operacion: String = " "

    print("Ingrese la operacion que desea realizar (suma, resta, multiplicacion o division): ")
    operacion = readln().lowercase()

    print("Ingrese el primer numero: ")
    num1 = readln().toDouble()

    print("Ingrese el segundo numero: ")
    num2 = readln().toDouble()

    val resultado = when (operacion) {
        "suma" -> num1 + num2
        "resta" -> num1 - num2
        "multiplicacion" -> num1 * num2
        "division" -> if (num2 != 0.0) num1 / num2 else "Error: División por cero"
        else -> "Operación no válida"
    }

    println("Resultado = $resultado")
}

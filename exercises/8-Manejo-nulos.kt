fun obtenerSaludo(nombre: String?): String {
    val nombreValido = if (!nombre.isNullOrBlank()) nombre.trim() else null

    return nombreValido?.let { "¡Hola, $it! Bienvenido/a." }
        ?: "¡Hola, usuario invitado! Bienvenido/a."
}

fun main() {
    println("--- Pruebas de manejo de nulos ---")

    val saludo1 = obtenerSaludo("Alejandro")
    println("Caso 'Alejandro': $saludo1")

    val usuarioNulo: String? = null
    val saludo2 = obtenerSaludo(usuarioNulo)
    println("Caso null: $saludo2")

    val saludo3 = obtenerSaludo("")
    println("Caso \"\": $saludo3")

    val saludo4 = obtenerSaludo("   ")
    println("Caso \"   \": $saludo4")
}
class Estudiante(val nombre: String, val nota1: Double, val nota2: Double, val nota3: Double) {
    fun calcularPromedio(): Double {
        return (nota1 + nota2 + nota3) / 3
    }

    fun obtenerEstado(): String {
        val promedio = calcularPromedio()
        return if (promedio >= 3) {
            "Aprobado"
        } else {
            "Reprobado"
        }
    }

    fun obtenerRendimiento(): String {
        val promedio = calcularPromedio()
        return when {
            promedio >= 4.5 -> "Excelente"
            promedio >= 4.0 -> "Muy Bueno"
            promedio >= 3.5 -> "Bueno"
            promedio >= 3.0 -> "Regular"
            else -> "Insuficiente"
        }
    }
}

fun mostrarMenu() {
    println(
        """
           ========== Student Manager ==========
           1. Registrar estudiantes
           2. Mostrar estudiantes
           3. Buscar estudiante
           4. Ver estadísticas del grupo
           0. Salir
        """.trimIndent()
    )
}

fun leerDoubleValido(mensaje: String): Double {
    while (true) {
        print(mensaje)
        val valor = readln().toDoubleOrNull()
        if (valor != null) return valor
        println("Valor inválido. Ingrese un número (ej: 4.5).")
    }
}

fun registrarEstudiante(estudiantes: MutableList<Estudiante>) {
    print("Ingrese la cantidad de estudiantes a registrar: ")
    val cantidad = readln().toIntOrNull() ?: 0

    for (i in 1..cantidad) {
        println("Estudiante $i:")

        print("Ingrese el nombre del estudiante: ")
        val nombre = readln()

        val nota1 = leerDoubleValido("Ingrese la nota 1: ")
        val nota2 = leerDoubleValido("Ingrese la nota 2: ")
        val nota3 = leerDoubleValido("Ingrese la nota 3: ")

        estudiantes.add(Estudiante(nombre, nota1, nota2, nota3))
    }

    println("Estudiantes registrados correctamente.")
}

fun mostrarEstudiantes(estudiantes: List<Estudiante>) {
    if (estudiantes.isEmpty()) {
        println("No hay estudiantes registrados.")
        return
    }

    println("========== Resultados ==========")
    for (estudiante in estudiantes) {
        println("${estudiante.nombre}: ${estudiante.calcularPromedio()}")
        println("Estado: ${estudiante.obtenerEstado()}")
        println("Rendimiento: ${estudiante.obtenerRendimiento()}")
    }
}

fun buscarEstudiante(estudiantes: List<Estudiante>, nombre: String): Estudiante? {
    for (estudiante in estudiantes) {
        if (estudiante.nombre.equals(nombre, ignoreCase = true)) {
            return estudiante
        }
    }
    return null
}

fun mostrarEstadisticas(estudiantes: List<Estudiante>) {
    if (estudiantes.isEmpty()) {
        println("No hay estudiantes registrados.")
        return
    }

    var total = 0.0
    var aprobados = 0
    for (estudiante in estudiantes) {
        val promedio = estudiante.calcularPromedio()
        total += promedio
        if (promedio >= 3.0) {
            aprobados++
        }
    }

    val promedioGrupo = total / estudiantes.size
    println("Promedio del grupo: $promedioGrupo")
    println("Cantidad de aprobados: $aprobados")
    println("Cantidad de reprobados: ${estudiantes.size - aprobados}")
}

fun main() {
    val estudiantes = mutableListOf<Estudiante>()
    var ejecutando = true

    while (ejecutando) {
        mostrarMenu()

        print("Seleccione una opción: ")
        val opcion = readln().toIntOrNull()

        when (opcion) {
            1 -> registrarEstudiante(estudiantes)
            2 -> mostrarEstudiantes(estudiantes)
            3 -> {
                print("Ingrese el nombre del estudiante a buscar: ")
                val nombreBusqueda = readln()
                val encontrado = buscarEstudiante(estudiantes, nombreBusqueda)
                val mensaje = encontrado?.nombre ?: "Estudiante no encontrado."
                println("RESULTADO: $mensaje")
            }
            4 -> mostrarEstadisticas(estudiantes)
            0 -> {
                println("Saliendo del programa...")
                ejecutando = false
            }
            else -> println("Opción inválida. Por favor, seleccione una opción válida.")
        }
    }
}
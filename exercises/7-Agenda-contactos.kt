class Contact(
    val nombre: String,
    val telefono: String,
    val email: String
) {
    override fun toString(): String {
        return "Nombre: $nombre | Teléfono: $telefono | Correo: $email"
    }
}

class Agenda {
    private val contactos: MutableList<Contact> = mutableListOf()

    fun agregar(contacto: Contact) {
        contactos.add(contacto)
        println("Contacto '${contacto.nombre}' agregado correctamente.")
    }

    fun listar() {
        if (contactos.isEmpty()) {
            println("La agenda está vacía.")
            return
        }
        println("\n--- LISTA DE CONTACTOS (${contactos.size}) ---")
        contactos.forEachIndexed { index, contacto ->
            println("${index + 1}. $contacto")
        }
    }

    fun buscarPorNombre(nombre: String) {
        val encontrado = contactos.find { it.nombre.equals(nombre, ignoreCase = true) }

        if (encontrado != null) {
            println("Contacto encontrado -> $encontrado")
        } else {
            println("Error: El contacto '$nombre' no existe en la agenda.")
        }
    }

    fun eliminarPorNombre(nombre: String) {
        val eliminado = contactos.removeIf { it.nombre.equals(nombre, ignoreCase = true) }

        if (eliminado) {
            println("Contacto '$nombre' eliminado exitosamente.")
        } else {
            println("Error: No se pudo eliminar. El contacto '$nombre' no existe.")
        }
    }
}

fun main() {
    val agenda = Agenda()


    agenda.agregar(Contact("Ana Gómez", "3001234567", "ana@email.com"))
    agenda.agregar(Contact("Carlos Pérez", "3119876543", "carlos@email.com"))
    agenda.agregar(Contact("Laura Torres", "3155554433", "laura@email.com"))
    agenda.agregar(Contact("Diego Ríos", "3202221100", "diego@email.com"))
    agenda.agregar(Contact("Elena Blanco", "3189998877", "elena@email.com"))


    agenda.listar()

    println("\n--- PRUEBAS DE BÚSQUEDA ---")
    agenda.buscarPorNombre("Laura Torres")
    agenda.buscarPorNombre("Mateo Morales")

    println("\n--- PRUEBAS DE ELIMINACIÓN ---")
    agenda.eliminarPorNombre("Carlos Pérez")
    agenda.eliminarPorNombre("Carlos Pérez")


    agenda.listar()
}
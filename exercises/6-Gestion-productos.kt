class Product(val nombre: String, val precio: Double, val cantidad: Int) {

    fun valorTotal(): Double {
        return precio * cantidad
    }

    fun mostrarInfo() {
        println("--- Info de $nombre ---")
        println("Precio unidad: $$precio")
        println("Cantidad disponible: $cantidad")
        println("Valor total en inventario: $${valorTotal()}")
    }
}

fun createProduct(): Product {
    print("Ingrese el nombre del producto: ")
    val nombre = readln()

    print("Ingrese el precio del producto: ")
    val precio = readln().toDouble()

    print("Ingrese la cantidad del producto: ")
    val cantidad = readln().toInt()

    return Product(nombre, precio, cantidad)
}

fun main() {
    val miProducto = createProduct()

    println()

    miProducto.mostrarInfo()
}
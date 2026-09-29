# Kotlin Beginner Workshop

##  Estudiante

**Nombre:** Kevin Giovanny Alarcón Muñoz

##  Descripción

Este repositorio contiene el desarrollo del taller **Introducción a Kotlin – Fundamentos de programación**.

El objetivo del taller es practicar los conceptos fundamentales del lenguaje Kotlin mediante diferentes ejercicios relacionados con variables, tipos de datos, condicionales, ciclos, funciones, colecciones, clases y manejo seguro de valores nulos.

## 📂 Estructura del repositorio

```text
kotlin-beginner-workshop/
│
├── README.md
├── exercises/
   └── 1-Calculadora-basica.kt
   └── 2-clasificacion-estudiantes.kt
   └── 3-Tabla-multiplicar.kt
   └── 4-analisis-lista.kt
   └── 5-funciones-matematicas.kt
   └── 6-Gestion-productos.kt
   └── 7-Agenda-contactos.kt
   └── 8-Manejo-nulos.kt
```

##  Ejercicios

### Exercise 01 — Calculadora básica

Implementación de una calculadora básica utilizando `when` para realizar operaciones de suma, resta, multiplicación y división, incluyendo el control de división entre cero.

### Exercise 02 — Clasificación de estudiantes

Programa que recibe el nombre de un estudiante y tres calificaciones, calcula el promedio y determina si el estudiante está aprobado, reprobado o tiene un promedio excelente.

### Exercise 03 — Tabla de multiplicar

Generación de la tabla de multiplicar de un número del 1 al 10 utilizando un ciclo `for`. También se calcula la suma de los resultados.

### Exercise 04 — Análisis de una lista

Programa que trabaja con una colección de números enteros para calcular la suma, promedio, número mayor, número menor y cantidad de números pares e impares.

### Exercise 05 — Funciones matemáticas

Implementación de tres funciones:

* `isPrime(number: Int)` — determina si un número es primo.
* `factorial(number: Int)` — calcula el factorial de un número no negativo.
* `isEven(number: Int)` — determina si un número es par o impar.

### Exercise 06 — Gestión de productos

Creación de una clase `Product` con nombre, precio y cantidad disponible. Se calcula el valor total del inventario y se muestra la información de los productos.

### Exercise 07 — Agenda de contactos

Implementación de una clase `Contact` y una lista mutable para administrar contactos. El programa permite agregar, listar, buscar y eliminar contactos.

### Exercise 08 — Manejo de valores nulos

Implementación de una función que recibe un nombre de usuario de tipo `String?` y utiliza Kotlin Null Safety para mostrar un saludo personalizado o un saludo genérico cuando el valor es nulo o está vacío.

##  Cómo ejecutar los ejercicios

Cada ejercicio es independiente y contiene su propio archivo `Main.kt`.

### Opción 1 — IntelliJ IDEA

1. Abrir el proyecto en IntelliJ IDEA.
2. Abrir la carpeta del ejercicio que se desea ejecutar.
3. Abrir el archivo `Main.kt`.
4. Ejecutar la función `main()` utilizando el botón **Run**.

### Opción 2 — Kotlin Playground

También es posible copiar el código de cada ejercicio en [Kotlin Playground](https://play.kotlinlang.org/) y ejecutarlo directamente.

##  Tecnologías utilizadas

* **Kotlin**
* **IntelliJ IDEA**
* **Git**
* **GitHub**

##  Documentación

* [Kotlin Tour](https://kotlinlang.org/docs/kotlin-tour-hello-world.html)
* [Kotlin Playground](https://play.kotlinlang.org/)

##  Objetivo del proyecto

Este proyecto busca reforzar los fundamentos de programación utilizando Kotlin y comprender la aplicación práctica de sus principales características mediante ejercicios independientes.

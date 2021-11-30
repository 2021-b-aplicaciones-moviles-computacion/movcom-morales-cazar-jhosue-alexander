import java.util.*
import kotlin.collections.ArrayList

fun main() {
    println("Hola mundo")

    //Tipos de variables
    //Inmutables (val)
    val inmutable: String = "Adrian"
    // inmutable = "Vicente"; //X
    //Mutable (var)
    var mutable: String = "Vicente"
    mutable = "Adrian";

    //val>var

    // Sintaxis y Duck Typing

    val ejemploVariable = "Nombre"
    var edadEjemplo: Int = 12
    // edadEjemplo = 12.2

    // Tipos de variable JAVA

    val nombreProfesor: String = "Adrian Eguez"
    val sueldo: Double = 1.2
    val estadoCivil: Char = 'S'
    val fechaNacimiento: Date = Date()

    // Condicionales
    if (true){
        //Verdadera
    }else{
        //Falso
    }

    // switch Estado -> S -> C -> ::::
    val estadoCivilWhen: String = "S"

    when (estadoCivilWhen){
        ("S") -> {
            println("Acercarse")
        }
        "C" -> {
            println("Alejarse")
        }
        "UN" -> println("Hablar")
        else -> println("No reconocido")
    }

    val coqueteo = if (estadoCivilWhen == "S") "Si" else "No"
    // condicion ? bloque-true : bloque-false


    imprimirNombre("Adrian")

    calcularSueldo(100.00, 14.00, 25.00)

    //Named Parameters
    calcularSueldo(
        bonoEspecial = 15.00,
        sueldo = 150.00,
    )


    // Tipos de Arreglos

    // Arreglo Estatico
    val arregloEstatico: Array<Int> = arrayOf(1, 2, 3)
    println(arregloEstatico)
    // Arreglos Dinamicos
    val arregloDinamico: ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(arregloDinamico)
    arregloDinamico.add(11)
    arregloDinamico.add(12)
    println(arregloDinamico)

    // OPERADORES -> Sirven para los arreglos estaticos y dinamicos

    // FOR EACH -> Unit
    // Iterar un arreglo

    val respuestaForEach: Unit = arregloDinamico
        .forEach{ valorActual: Int ->
            println("Valor actual: ${valorActual}")
        }

    arregloDinamico.forEachIndexed{
        indice: Int, valorActual: Int ->
        println("Valor ${valorActual} Indice: ${indice}")
    }
    println(respuestaForEach)

    // MAP -> Muta el arreglo (Cambia el arreglo)
    // 1) Enviemos el nuevo valor de la iteracion
    // 2) Nos devuelve es un NUEVO ARREGLO con los valores modificados

    val respuestaMap: List<Double> = arregloDinamico.map {
            valorActual: Int ->
            return@map valorActual.toDouble() + 100.00
    }
    println(respuestaMap)

    val respuestaMapDos = arregloDinamico.map { it + 15 }

    println(respuestaMapDos)

}

//void imprimirNombre (String nombre){}
fun imprimirNombre (nombre: String): Unit { //Unit es el void y es opcional
    println("Nombre: ${nombre}")
}

fun calcularSueldo(
    sueldo: Double, //Requerido
    tasa: Double = 12.00, //Opcional
    bonoEspecial: Double? = null, // Opcional (Null) -> nullable
): Double {
    // String -> String?
    // Int -> Int?
    // Date -> Date?
    if (bonoEspecial == null){
        return sueldo * (100 / tasa)
    }else{
        return sueldo * (100 / tasa) + bonoEspecial
    }
}
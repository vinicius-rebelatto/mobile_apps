import kotlin.math.pow
import kotlin.math.sqrt

fun media_ponderada(nota1: Double, nota2: Double, nota3: Double, peso1: Double, peso2: Double, peso3: Double)
{
    val media = (nota1 * peso1 + nota2 * peso2+ nota3 * peso3) / (peso1 + peso2 + peso3)
    println("$media")
}


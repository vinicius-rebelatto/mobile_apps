import kotlin.math.pow
import kotlin.math.sqrt

fun dist_posntos(x1: Double, y1: Double, x2: Double, y2: Double)
{
    val distancia = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    println("$distancia")
}


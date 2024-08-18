
fun fala_mes(mes : Int)
{
    val meses = listOf("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")
    if (mes in 1..12)
        println("$mes = ${meses[mes-1]}")
    else
        println("entrada inválida")
}


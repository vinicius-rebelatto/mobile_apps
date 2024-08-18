
fun calc_dinamica(A: Double, B: Double, operador: Char)
{
    if (operador == '-')
        println("$A $operador $B = ${A - B}")
    else if (operador == '+')
        println("$A $operador $B = ${A + B}")
    else if (operador == '/')
        if (B > 0)
            println("$A $operador $B = ${A / B}")
        else
            println("Não divisível por 0")
    else if (operador == '*')
        println("$A $operador $B = ${A * B}")

    else
        println("Entrada inválida!")
}


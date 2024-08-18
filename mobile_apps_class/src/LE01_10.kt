/*Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
menor ou igual a 10!”, caso este número seja menor ou igual.*/

fun extenso(num : Int)
{
    if (num in 1..5)
    {
        val numbers = listOf("one","two","three","four","five")
        var i = 0
        do {
            println(numbers[i])
            i++
        } while (i < num)
    }
    else
    {
        println("“Número inválido!")
    }

}


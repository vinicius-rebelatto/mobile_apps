/*Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o
valor da variável A. Apresentar uma mensagem com o valor original de cada variável
e outra com os valores trocados.*/

fun celsius_para_fahrenheit(celsius:Double)
{
    val fahrenheit = celsius * 1.8 + 32
    println("$celsius°C equivale à $fahrenheit°F")
}
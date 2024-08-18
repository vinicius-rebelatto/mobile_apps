/*Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor
da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o
valor da variável A. Apresentar uma mensagem com o valor original de cada variável
e outra com os valores trocados.*/

fun troca_variavel(A : Int, B : Int)
{
    var a = A
    var b = B
    val temp = a
    a = b
    b = temp
    println("Valores trocados A: $a, B: $b")
}
/*Escreva um algoritmo que leia os valores de dois números inteiros distintos nas
variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informar
ao usuário que a sequência de números informados é inválida.*/

fun maior_que(A : Int, B : Int)
{
    if (A > B)
        println("$A é maior que $B")
    else if (B > A)
        println("$B é maior que $A")
    else
        println("Sequência de números informados é inválida")
}
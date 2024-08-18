/*Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
o usuário também deverá ser informado.*/

fun intervalo(num: Int)
{
    if (num in 100..200)
        println("O número $num está entre 100 e 200")
    else
        println("O número $num não está entre 100 e 200")
}
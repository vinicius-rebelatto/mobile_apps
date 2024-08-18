/*Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
menor ou igual a 10!”, caso este número seja menor ou igual.*/

fun maior_50(num : Int)
{
    if (num > 50)
        println("O número $num é maior que 50")
    else if (num == 50)
        println("O número $num é igual a 50")
    else
        println("O número $num é menor que 50")
}
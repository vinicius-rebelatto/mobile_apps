/*Escreva um algoritmo que leia um número digitado pelo usuário e mostre a
mensagem “Número maior do que 10!”, caso este número seja maior, ou “Número
menor ou igual a 10!”, caso este número seja menor ou igual.*/

fun maior(num : Int)
{
    if (num > 10)
        println("O número $num é maior que 10")
    else if (num == 10)
        println("O número $num é igual a 10")
    else
        println("O número $num é menor que 10")
}
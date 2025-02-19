/*
Faça uma função que mostre o dobro do número passado. Caso o número seja menor
ou igual a zero deve mostrar a mensagem “Só é aceito números positivos maiores que
zero”.
*/
function dobroNumero(numero) {
    if (numero <= 0) {
        console.log("Só é aceito números positivos maiores que zero")
    } else {
        console.log(numero * 2)
    }
}
dobroNumero(5) 
dobroNumero(0)
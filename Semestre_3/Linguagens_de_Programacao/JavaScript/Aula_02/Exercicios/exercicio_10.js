/* 
Escreva uma função que verifique se uma determinada string é um palíndromo (ou
seja, pode ser lida da mesma forma tanto da esquerda para a direita quanto da direita
para a esquerda)
*/

let inverterString = (string) => string.split("").reverse().join("")

function verificarPalindromo(string) {
    return inverterString(string.toLowerCase()) == string.toLowerCase()
}

console.log("arara: " + verificarPalindromo("arara"))
console.log("Facens: " + verificarPalindromo("Facens"))
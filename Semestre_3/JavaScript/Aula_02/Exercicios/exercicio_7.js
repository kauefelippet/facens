// Escreva uma função que receba uma string como argumento e retorne a string invertida.

function inverterString(string) {
    return string.split("").reverse().join("")
}

console.log(inverterString("Facens"))
/*
Escreva uma função que recebe uma string como argumento e retorna o número de
vogais presentes nessa string. Considere apenas vogais minúsculas (a, e, i, o, u).
*/

function contarVogais(string) {
    let vogais = ["a", "e", "i", "o", "u"]
    let count = 0
    for (let i = 0; i < string.length; i++) {
        if (vogais.includes(string[i])) {
            count++
        }
    }
    return count
}

console.log(contarVogais("Facens")) 
console.log(contarVogais("João da Silva"))
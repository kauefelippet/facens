/*
Escreva uma função que recebe um vetor de números inteiros e mostre como
resultado qual é o menor e qual é o maior número.
*/

let exibirMaiorEMenor = (array) => {
    if (!Array.isArray(array)) return "O parâmetro não é um array"

    let maior = array[0]
    let menor = array[0]
    for (let i = 0; i < array.length; i++) {
        if (array[i] > maior) {
            maior = array[i]
        }
        if (array[i] < menor) {
            menor = array[i]
        }
    }
    return `Maior: ${maior}, Menor: ${menor}`
}

let array = [12, 26, 13, 42, 5]
console.log(exibirMaiorEMenor(array))
console.log(typeof array)

console.log(exibirMaiorEMenor(1))
/* 
Escreva um programa que imprima os números de 1 a 10 no console usando um loop.
Os número devem ser separados com um traço, ex.: 1 – 2 – 3 - ... – 10. Observação:
após o número 10 não pode ter um traço.
*/
let output = []
for (let i = 1; i <= 10; i++) {
    output.push(i.toString())
    if (i != 10) {
        output.push("-")
    }
}
console.log(output.join(" "))
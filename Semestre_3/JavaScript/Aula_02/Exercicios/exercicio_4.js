// Faça um programa que recebe o nome de uma variável e mostre o <<primeiro>>.<<último nome>>@facens.br

var nome = "João da Silva"
var nomeSplit = nome.split(" ")
console.log(`${nomeSplit[0].toLowerCase()}.${nomeSplit[nomeSplit.length - 1].toLowerCase()}@facens.br`)
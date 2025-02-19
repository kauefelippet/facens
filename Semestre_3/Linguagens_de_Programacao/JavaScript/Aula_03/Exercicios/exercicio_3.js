/*
Elabore duas funções que recebem três parâmetros: capital inicial, taxa de juros
e tempo de aplicação. A primeira função retornará o montante da aplicação
financeira sob o regime de juros simples e a segunda retornará o valor da
aplicação sob o regime de juros compostos.
*/


let calcularJurosSimples = (capitalInicial, taxaJuros, tempoAplicacao) => capitalInicial + (capitalInicial * taxaJuros * tempoAplicacao)

let calcularJurosCompostos = (capitalInicial, taxaJuros, tempoAplicacao) => capitalInicial * (1 + taxaJuros) ** tempoAplicacao

console.log(calcularJurosSimples(1000, 0.1, 12))
console.log(calcularJurosCompostos(1000, 0.1, 12))  
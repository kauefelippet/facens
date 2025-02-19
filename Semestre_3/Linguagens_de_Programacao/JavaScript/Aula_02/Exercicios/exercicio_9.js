/*
Escreva uma função que recebe um endereço de e-mail como argumento e retorna
true se o e-mail for válido ou false caso contrário. Um e-mail válido deve conter um
único símbolo '@' e pelo menos um ponto '.' após o '@'.
*/

function validarEmail(email) {
    if (email.indexOf("@") === -1 || email.split("@").length !== 2) { // Valida se existe um único @
        return false
    }
    if (email.split("@")[1].indexOf(".") === -1) { // Valida se existe pelo menos um ponto após o @
        return false
    }
    if (email.split("@")[0].length === 0 || email.split("@")[1].length === 0) { // Valida se o email não é vazio
        return false
    }
    let splitEmail = email.split(".")
    for (let i = 0; i < splitEmail.length; i++) { // Valida se todos os pontos possuem pelo menos um caractere
        if (splitEmail[i].length === 0) {
            return false
        }
    }
    return true
}

console.log("aluno@facens.br: " + validarEmail("aluno@facens.br"))
console.log("@.: " + validarEmail("@."))
console.log("aluno@.: " + validarEmail("aluno@."))
console.log(".@facens.br.: " + validarEmail(".@facens.br."))
console.log("aluno@facens.br.: " + validarEmail("aluno@facens.br."))
console.log("aluno@facens: " + validarEmail("aluno@facens"))
console.log("alunofacens.br: " + validarEmail("alunofacens.br"))
console.log("aluno: " + validarEmail("aluno"))

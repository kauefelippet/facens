import { Component } from '@angular/core';

@Component({
  selector: 'app-apolice-seguro',
  standalone: false,
  templateUrl: './apolice-seguro.component.html',
  styleUrl: './apolice-seguro.component.css'
})
export class ApoliceSeguroComponent {
  segurado = {
    nome: '',
    sexo: 'Masculino',
    idade: 18,
    valorAutomovel: 0
  };

  valorApolice: Number = 0;

  calcularApolice() {
    let porcentagem = 0;

    if (this.segurado.sexo === 'Masculino') {
      if (this.segurado.idade <= 25) {
        porcentagem = 0.15;
      } else {
        porcentagem = 0.10;
      }
    } else {
        porcentagem = 0.08;
    }
    this.valorApolice = Number((this.segurado.valorAutomovel * porcentagem).toFixed(2));
  }
}

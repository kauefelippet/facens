import { Component } from '@angular/core';

@Component({
  selector: 'app-calculadora-imc',
  standalone: false,
  templateUrl: './calculadora-imc.component.html',
  styleUrl: './calculadora-imc.component.css'
})
export class CalculadoraImcComponent {
  peso: number = 0;
  altura: number = 0;
  imc: number = 0;
  classificacao: string = '';

  calcularIMC() {
    if (this.altura <= 0 || this.peso <= 0) {
      this.classificacao = 'Dados inválidos!';
      return;
    }

    this.imc = Number((this.peso / (this.altura * this.altura)).toFixed(2));

    switch (true) {
      case this.imc < 18.5:
      this.classificacao = 'Abaixo do peso';
      break;
      case this.imc < 25:
      this.classificacao = 'Peso normal';
      break;
      case this.imc < 30:
      this.classificacao = 'Sobrepeso';
      break;
      case this.imc < 35:
      this.classificacao = 'Obesidade grau I';
      break;
      case this.imc < 40:
      this.classificacao = 'Obesidade grau II';
      break;
      default:
      this.classificacao = 'Obesidade grau III';
      break;
    }
  }
}

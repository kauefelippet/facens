import { Component } from '@angular/core';

@Component({
  selector: 'app-calculadora',
  standalone: false,
  templateUrl: './calculadora.component.html',
  styleUrl: './calculadora.component.css'
})
export class CalculadoraComponent {

  num1: number = 0;
  num2: number = 0;
  resultado: number = 0;
  operation: string = '';

  calcular(): void {
    switch (this.operation) {
      case 'soma':
        this.resultado = this.num1 + this.num2;
        break;
      case 'subtracao':
        this.resultado = this.num1 - this.num2;
        break;
      case 'multiplicacao':
        this.resultado = this.num1 * this.num2;
        break;
      case 'divisao':
        this.resultado = this.num1 / this.num2;
        break;
      default:
        this.resultado = 0;
        break;
    }
  }
}

import { Component } from '@angular/core';

@Component({
  selector: 'app-calcular-media',
  standalone: false,
  templateUrl: './calcular-media.component.html',
  styleUrl: './calcular-media.component.css'
})
export class CalcularMediaComponent {

  ac1: number = 0;
  ac2: number = 0;
  ag: number = 0;
  af: number = 0;

  mediaFinal: number = 0;
  resultado: string = '';

  calcularMedia() {
    this.mediaFinal = Number(((this.ac1 * 0.15 + this.ac2 * 0.3 + this.ag * 0.1 + this.af * 0.45)).toFixed(2));
    if (this.mediaFinal >= 5) {
      this.resultado = 'Aprovado!';
    } else {
      this.resultado = 'Reprovado!';
    }
  }
}

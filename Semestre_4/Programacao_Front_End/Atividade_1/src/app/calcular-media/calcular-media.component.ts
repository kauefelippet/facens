import { Component } from '@angular/core';

@Component({
  selector: 'app-calcular-media',
  standalone: false,
  templateUrl: './calcular-media.component.html',
  styleUrl: './calcular-media.component.css'
})
export class CalcularMediaComponent {

  notas = {
    ac1: 0,
    ac2: 0,
    ag: 0,
    af: 0
  };

  mediaFinal: number = 0;
  resultado: string = '';

  calcularMedia() {
    const { ac1, ac2, ag, af } = this.notas;
    this.mediaFinal = Number(((ac1 * 0.15 + ac2 * 0.3 + ag * 0.1 + af * 0.45)).toFixed(2));
    if (this.mediaFinal >= 5) {
      this.resultado = 'Aprovado!';
    } else {
      this.resultado = 'Reprovado!';
    }
  }
}

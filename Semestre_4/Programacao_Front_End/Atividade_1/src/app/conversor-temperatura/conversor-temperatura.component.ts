import { Component } from '@angular/core';

@Component({
  selector: 'app-conversor-temperatura',
  standalone: false,
  templateUrl: './conversor-temperatura.component.html',
  styleUrl: './conversor-temperatura.component.css'
})
export class ConversorTemperaturaComponent {

  temperaturaCelsius: number = 0;
  temperaturaFahrenheit: number = 32;
  temperaturaKelvin: number = 273.15;

  converterTemperatura() {
    this.temperaturaFahrenheit = Number((this.temperaturaCelsius * 9 / 5 + 32).toFixed(2));
    this.temperaturaKelvin = Number((this.temperaturaCelsius + 273.15).toFixed(2));
  }
}

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CalcularMediaComponent } from './calcular-media/calcular-media.component';
import { ApoliceSeguroComponent } from './apolice-seguro/apolice-seguro.component';
import { ConversorTemperaturaComponent } from './conversor-temperatura/conversor-temperatura.component';
import { CalculadoraImcComponent } from './calculadora-imc/calculadora-imc.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'app-calcular-media', component: CalcularMediaComponent },
  { path: 'app-apolice-seguro', component: ApoliceSeguroComponent },
  { path: 'app-conversor-temperatura', component: ConversorTemperaturaComponent },
  { path: 'app-calculadora-imc', component: CalculadoraImcComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuSuperiorComponent } from './menu-superior/menu-superior.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { CalcularMediaComponent } from './calcular-media/calcular-media.component';
import { ApoliceSeguroComponent } from './apolice-seguro/apolice-seguro.component';
import { ConversorTemperaturaComponent } from './conversor-temperatura/conversor-temperatura.component';
import { CalculadoraImcComponent } from './calculadora-imc/calculadora-imc.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuSuperiorComponent,
    HomeComponent,
    CalcularMediaComponent,
    ApoliceSeguroComponent,
    ConversorTemperaturaComponent,
    CalculadoraImcComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

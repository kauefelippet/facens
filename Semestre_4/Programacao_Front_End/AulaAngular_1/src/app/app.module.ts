import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuSuperiorComponent } from './menu-superior/menu-superior.component';
import { DestaqueComponent } from './destaque/destaque.component';
import { NoticiaComponent } from './noticia/noticia.component';
import { NgbCarouselModule, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { ListaClientesComponent } from './lista-clientes/lista-clientes.component';
import { HomeComponent } from './home/home.component';
import { CalculadoraComponent } from './calculadora/calculadora.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { TelaPaiComponent } from './tela-pai/tela-pai.component';
import { TelaFilho1Component } from './tela-filho1/tela-filho1.component';
import { TelaFilho2Component } from './tela-filho2/tela-filho2.component';
import { NoticiaDetalheComponent } from './noticia-detalhe/noticia-detalhe.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    MenuSuperiorComponent,
    DestaqueComponent,
    NoticiaComponent,
    ListaClientesComponent,
    HomeComponent,
    CalculadoraComponent,
    PageNotFoundComponent,
    TelaPaiComponent,
    TelaFilho1Component,
    TelaFilho2Component,
    NoticiaDetalheComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    FormsModule,
    NgbCarouselModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

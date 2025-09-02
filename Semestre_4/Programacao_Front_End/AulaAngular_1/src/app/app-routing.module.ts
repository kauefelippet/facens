import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CalculadoraComponent } from './calculadora/calculadora.component';
import { ListaClientesComponent } from './lista-clientes/lista-clientes.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { TelaFilho1Component } from './tela-filho1/tela-filho1.component';
import { TelaFilho2Component } from './tela-filho2/tela-filho2.component';
import { TelaPaiComponent } from './tela-pai/tela-pai.component';

const routes: Routes = [
  { path: '', redirectTo: '/home', pathMatch: 'full' },
  { path: 'home', component: HomeComponent },
  { path: 'calculadora', component: CalculadoraComponent },
  { path: 'lista-clientes', component: ListaClientesComponent },
  { path: 'app-tela-pai', component: TelaPaiComponent, children: [
    { path: 'app-tela-filho1', component: TelaFilho1Component },
    { path: 'app-tela-filho2', component: TelaFilho2Component }
  ] },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

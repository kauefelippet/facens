import { Component } from '@angular/core';

@Component({
  selector: 'app-lista-clientes',
  standalone: false,
  templateUrl: './lista-clientes.component.html',
  styleUrl: './lista-clientes.component.css'
})
export class ListaClientesComponent {
  clientes = [
    { id: 1, nome: 'João Silva', celular: '(11) 91234-5678' },
    { id: 2, nome: 'Maria Oliveira', celular: '(11) 99876-5432' },
    { id: 3, nome: 'Carlos Souza', celular: '(11) 98765-4321' },
    { id: 4, nome: 'Ana Santos', celular: '(11) 97654-3210' }
  ];
}

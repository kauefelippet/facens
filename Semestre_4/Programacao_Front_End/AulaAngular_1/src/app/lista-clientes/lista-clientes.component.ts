import { Component } from '@angular/core';
import { Cliente } from '../models/cliente';

@Component({
  selector: 'app-lista-clientes',
  standalone: false,
  templateUrl: './lista-clientes.component.html',
  styleUrl: './lista-clientes.component.css'
})
export class ListaClientesComponent {
  clientes: Cliente[] = [
    { id: 1, nome: 'João Silva', celular: '(11) 91234-5678', cidade: 'São Paulo' },
    { id: 2, nome: 'Maria Oliveira', celular: '(11) 99876-5432', cidade: 'Campinas' },
    { id: 3, nome: 'Carlos Souza', celular: '(11) 98765-4321', cidade: 'Santos' },
    { id: 4, nome: 'Ana Santos', celular: '(11) 97654-3210', cidade: 'Guarulhos' }
  ];

  nome: string = '';

  clienteSelecionado: Cliente | null = null;

  selecionarCliente(cliente: Cliente | null) {
    this.clienteSelecionado = cliente;
  }
}

import { Component, OnInit } from '@angular/core';
import { Cliente } from '../models/cliente';
import { ClienteService } from '../services/cliente.service';

@Component({
  selector: 'app-lista-clientes',
  standalone: false,
  templateUrl: './lista-clientes.component.html',
  styleUrl: './lista-clientes.component.css'
})
export class ListaClientesComponent implements OnInit {

  clientes: Cliente[] = [];
  nome: string = '';
  clienteSelecionado: Cliente | null = null;

  ngOnInit(): void {
    this.buscarClientes();
  }

  constructor(private clienteService: ClienteService) { }

  buscarClientes() {
    this.clienteService.listarClientes().subscribe({
      next: (data: Cliente[]) => {
        this.clientes = data;
      },
      error: (err) => {
        console.error('Erro ao listar clientes:', err);
      }
    });
  }

  selecionarCliente(cliente: Cliente | null) {
    this.clienteSelecionado = cliente;
  }
}

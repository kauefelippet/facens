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

  excluirCliente(id: number) {
    if (confirm('Tem certeza que deseja excluir este cliente?')) {
      this.clienteService.excluirCliente(id).subscribe({
        next: () => {
          alert('Cliente excluído com sucesso');
          this.buscarClientes();
        },
        error: (err) => {
          alert('Erro ao excluir cliente: ' + err);
        }
      });
    }
  }
}

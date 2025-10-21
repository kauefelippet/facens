import { Component, OnInit } from '@angular/core';
import { Cliente } from '../models/cliente';
import { StorageService } from '../services/local-storage.service';


@Component({
  selector: 'app-tela-filho1',
  standalone: false,
  templateUrl: './tela-filho1.component.html',
  styleUrl: './tela-filho1.component.css'
})
export class TelaFilho1Component implements OnInit {
  cliente: Cliente = {};

  constructor(private storageService: StorageService) { }

  ngOnInit(): void {
    const clienteData = this.storageService.getSessionStorage('cliente');
    if (clienteData) {
      this.cliente = clienteData;
    }
  }

  submit(form: any) {
    if (form.valid) {
      this.cliente = form.value;
      this.storageService.setSessionStorage('cliente', this.cliente);
      alert(`Cliente cadastrado com sucesso!\nNome: ${this.cliente.nome}\nCelular: ${this.cliente.celular}\nCidade: ${this.cliente.cidade}\nE-mail: ${this.cliente.email}`);
      form.reset();
    }
  }
}


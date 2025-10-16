import { Component } from '@angular/core';
import { Cliente } from '../models/cliente';


@Component({
  selector: 'app-tela-filho1',
  standalone: false,
  templateUrl: './tela-filho1.component.html',
  styleUrl: './tela-filho1.component.css'
})
export class TelaFilho1Component {
  cliente: Cliente = {};

  submit(form: any) {
    if (form.valid) {
      this.cliente = form.value;
      alert(`Cliente cadastrado com sucesso!\nNome: ${this.cliente.nome}\nCelular: ${this.cliente.celular}\nCidade: ${this.cliente.cidade}\nE-mail: ${this.cliente.email}`);
      form.reset();
    }
  }
}


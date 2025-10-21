import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { finalize } from 'rxjs/operators';
import { Cliente } from '../models/cliente';
import { ClienteService } from '../services/cliente.service';

@Component({
  selector: 'app-tela-filho2',
  standalone: false,
  templateUrl: './tela-filho2.component.html',
  styleUrl: './tela-filho2.component.css'
})
export class TelaFilho2Component {
  form: FormGroup;
  cliente: Cliente = { id: 0 };
  loading = false;

  constructor(private clienteService: ClienteService) {
    this.form = new FormGroup({
      nome: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required, Validators.email]),
      cidade: new FormControl('', [Validators.required]),
    });
  }

  submit() {
    if (this.form.invalid) {
      // mark all controls so validation messages appear
      Object.values(this.form.controls).forEach(control => control.markAsTouched());
      return;
    }

    this.loading = true;
    const novoCliente: Cliente = { ...this.form.value } as Cliente;

    this.clienteService.inserirCliente(novoCliente).pipe(
      finalize(() => this.loading = false)
    ).subscribe({
      next: (created) => {
        alert('Cliente adicionado com sucesso');
        this.form.reset();
        this.form.markAsPristine();
        this.form.markAsUntouched();
      },
      error: (err) => {
        console.error('Erro ao adicionar cliente:', err);
        alert('Erro ao adicionar cliente. Veja console para detalhes.');
      }
    });

  }
}

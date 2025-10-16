import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Cliente } from '../models/cliente';

@Component({
  selector: 'app-tela-filho2',
  standalone: false,
  templateUrl: './tela-filho2.component.html',
  styleUrl: './tela-filho2.component.css'
})
export class TelaFilho2Component {
  form: FormGroup;
  cliente: Cliente = {};

  constructor() {
    this.form = new FormGroup({
      nome: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required, Validators.email]),
      cidade: new FormControl('', [Validators.required]),
      celular: new FormControl('', [Validators.required, Validators.pattern('[0-9]{10,11}')])
    });
  }

  submit(formValue: any) {
    if (this.form.valid) {
      console.log('Formulário válido:', formValue);
    } else {
      console.log('Formulário inválido');
    }
  }
}

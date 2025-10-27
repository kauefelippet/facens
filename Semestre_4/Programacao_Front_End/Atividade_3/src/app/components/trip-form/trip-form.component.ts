import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormBuilder, FormGroup, Validators, ValidatorFn, AbstractControl, ReactiveFormsModule } from '@angular/forms';
import { StorageService } from '../../services/storage.service';

@Component({
  selector: 'app-trip-form',
  standalone: true,
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './trip-form.component.html',
  styleUrl: './trip-form.component.scss'
})
export class TripFormComponent implements OnInit {

  form: FormGroup;

  destinos = ['Paris', 'Nova York', 'Tóquio', 'Rio de Janeiro'];

  constructor(private fb: FormBuilder, private storageService: StorageService) {
    this.form = this.fb.group({
      destino: ['', Validators.required],
      dataIda: ['', Validators.required],
      dataVolta: ['', Validators.required],
      passageiros: [1, [Validators.required, Validators.min(1), Validators.max(5)]],
      email: ['', [Validators.required, Validators.email]]
    }, { validators: this.validarData() });
  }

  ngOnInit() {
    const formSalvo = this.storageService.getLocalStorage('tripForm');
    if (formSalvo) {
      this.form.patchValue(formSalvo);
    }

    this.form.valueChanges.subscribe(values => {
      this.storageService.setLocalStorage('tripForm', values);
    });
  }

  private validarData(): ValidatorFn {
    return (group: AbstractControl) => {
      const ida = group.get('dataIda')?.value;
      const volta = group.get('dataVolta')?.value;

      if (!ida || !volta) return null;

      const dataIda = new Date(ida);
      const dataVolta = new Date(volta);

      return dataVolta > dataIda ? null : { datasInvalidas: true };
    };
  }

  submit() {
    alert('Form enviado com sucesso!');
    console.log(this.form.value);
    this.storageService.removeLocalStorage('tripForm');
    this.form.reset({ passageiros: 1 });
  }

}

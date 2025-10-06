import { Component } from '@angular/core';
import { Tarefa } from './tarefa';

@Component({
  selector: 'app-lista-tarefas',
  standalone: false,
  templateUrl: './lista-tarefas.component.html',
  styleUrl: './lista-tarefas.component.css'
})
export class ListaTarefasComponent {

  adicionandoTarefa: boolean = false;
  novaTarefaDescricao: string = '';
  tarefaBuscada: string = '';
  isToggled: boolean = false;


  tarefas: Tarefa[] = [
    { descricao: 'Estudar Angular', concluida: false },
    { descricao: 'Fazer compras', concluida: true },
    { descricao: 'Ler um livro', concluida: false }
  ];

  adicionarTarefa() {
    if (this.novaTarefaDescricao.trim()) {
      const novaTarefa: Tarefa = {
        descricao: this.novaTarefaDescricao,
        concluida: false
      };
      this.tarefas.push(novaTarefa);
      this.novaTarefaDescricao = '';
    }
  }

  excluirTarefa(tarefa: Tarefa) {
    this.tarefas = this.tarefas.filter(t => t !== tarefa);
  }

}

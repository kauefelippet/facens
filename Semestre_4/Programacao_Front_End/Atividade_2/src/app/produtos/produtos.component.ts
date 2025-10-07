import { Component } from '@angular/core';
import { Produto } from './produto';

@Component({
  selector: 'app-produtos',
  standalone: false,
  templateUrl: './produtos.component.html',
  styleUrls: ['./produtos.component.css']
})
export class ProdutosComponent {

  nome: string = '';
  selecionado: Produto | null = null;

  produtos: Produto[] = [
    { id: 1, nome: 'Mouse', preco: 49.9, descricao: 'O melhor mouse gamer que você imaginar!', emEstoque: true },
    { id: 2, nome: 'Teclado', preco: 129.99, descricao: 'O melhor teclado gamer que você imaginar!', emEstoque: true },
    { id: 3, nome: 'Fone de Ouvido', preco: 89.5, descricao: 'Fone potente com cancelamento de ruído', emEstoque: false },
    { id: 4, nome: 'Batata', preco: 27.0, descricao: 'Batata ultra-mega-gigantesca', emEstoque: true }
  ];

  comprar(produto: Produto): void {
    produto.emEstoque = false;
    alert(`Compra realizada: ${produto.nome} — Preço: R$ ${produto.preco.toFixed(2)}`);
  }
}

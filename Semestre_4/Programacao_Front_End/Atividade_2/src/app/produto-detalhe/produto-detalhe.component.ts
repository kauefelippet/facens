import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Produto } from '../produtos/produto';

@Component({
  selector: 'app-produto-detalhe',
  standalone: false,
  templateUrl: './produto-detalhe.component.html',
  styleUrl: './produto-detalhe.component.css'
})
export class ProdutoDetalheComponent implements OnInit {
  produto: Produto | undefined;

  produtos: Produto[] = [
    { id: 1, nome: 'Mouse', preco: 49.9, descricao: 'O melhor mouse gamer que você imaginar!', emEstoque: true },
    { id: 2, nome: 'Teclado', preco: 129.99, descricao: 'O melhor teclado gamer que você imaginar!', emEstoque: true },
    { id: 3, nome: 'Fone de Ouvido', preco: 89.5, descricao: 'Fone potente com cancelamento de ruído', emEstoque: false },
    { id: 4, nome: 'Batata', preco: 27.0, descricao: 'Batata ultra-mega-gigantesca', emEstoque: true }
  ];

  constructor(
    private route: ActivatedRoute,
  ) { }

  ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    this.produto = this.produtos.find(produto => produto.id === id);
  }
}

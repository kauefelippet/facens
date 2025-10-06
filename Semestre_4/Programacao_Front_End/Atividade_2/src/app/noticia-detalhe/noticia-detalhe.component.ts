import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-noticia-detalhe',
  standalone: false,
  templateUrl: './noticia-detalhe.component.html',
  styleUrl: './noticia-detalhe.component.css'
})

export class NoticiaDetalheComponent implements OnInit {

  id : number = 0;
  caminhoImagem : string = "images/1.jpg";
  x : string = "teste";

  constructor(private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = Number(this.route.snapshot.paramMap.get('id')) ?? 0;
  }

  voltar(): void {
    window.history.back();
  }

}

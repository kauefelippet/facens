import { Component } from '@angular/core';
import { NgbCarouselModule } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-destaque',
  standalone: false,
  templateUrl: './destaque.component.html',
  styleUrl: './destaque.component.css'
})
export class DestaqueComponent {
	images = [1, 2, 3].map((n) => `images/${n}.jpg`);
}

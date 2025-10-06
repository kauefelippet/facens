import { Component } from '@angular/core';

@Component({
  selector: 'app-page-not-found',
  standalone: false,
  templateUrl: './page-not-found.component.html',
  styleUrl: './page-not-found.component.scss'
})
export class PageNotFoundComponent {
  particles = Array(40).fill(0);

  goBackToEarth(): void {
    window.location.href = '/';
  }
}

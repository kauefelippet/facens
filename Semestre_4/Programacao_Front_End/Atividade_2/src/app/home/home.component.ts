import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  standalone: false,
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

  isBannerVisible: boolean = true;

  toggleBanner(): void {
    this.isBannerVisible = !this.isBannerVisible;
  }
}

import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: '**',
    loadComponent: () => import('./components/trip-form/trip-form.component').then(m => m.TripFormComponent)
  }
];

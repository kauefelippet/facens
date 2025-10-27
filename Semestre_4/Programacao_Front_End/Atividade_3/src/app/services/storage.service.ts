import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StorageService {

  constructor() { }

  setLocalStorage(key: string, value: any): void {
    localStorage.setItem(key, JSON.stringify(value));
  }

  getLocalStorage(key: string): any {
    const item = localStorage.getItem(key);
    return item ? JSON.parse(item) : null;
  }

  removeLocalStorage(key: string): void {
    localStorage.removeItem(key);
  }
}

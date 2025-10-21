import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Cliente } from '../models/cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  private urlApi = 'https://68f6c312f7fb897c66138374.mockapi.io/cliente/cliente';

  constructor(private http: HttpClient) { }

  listarClientes() {
    return this.http.get<Cliente[]>(this.urlApi);
  }

  inserirCliente(cliente: Cliente) {
    return this.http.post<Cliente>(this.urlApi, cliente);
  }

  excluirCliente(id: number) {
    return this.http.delete(`${this.urlApi}/${id}`);
  }
}

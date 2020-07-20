import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class SistemaService {
  constructor() {}
  baseURL = 'http://localhost:8080/sistema';
}

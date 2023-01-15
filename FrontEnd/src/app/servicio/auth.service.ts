import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {JwtDeto} from '../Model/jwt-deto';
import { LoginUsuario } from '../Model/login-usuario';
import { NuevoUsuario } from '../Model/nuevo-usuario';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  authURL = 'http://localhost:8080/auth/';
  constructor(private httpClient: HttpClient) { }
  
  public nuevo(nuevoUsuario:NuevoUsuario): Observable<any>{
    return this.httpClient.post<any>(this.authURL + 'nuevo', nuevoUsuario);
  }

  public login(loginUsuario: LoginUsuario): Observable<JwtDeto>{
    return this.httpClient.post<JwtDeto>(this.authURL + 'login', loginUsuario)
    
  }

}

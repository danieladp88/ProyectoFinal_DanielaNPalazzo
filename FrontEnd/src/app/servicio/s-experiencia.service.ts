import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Experiecia } from '../Model/experiecia';

@Injectable({
  providedIn: 'root'
})
/*
export class SExperienciaService {
<<<<<<< HEAD
  expURL = 'https://backend-mgb.herokuapp.com/explab/';
=======
  URL = environment.URL + 'explab/';
>>>>>>> dbccedd5c18384aa757cbb7ab7d9f7f3bc0e7672
*/
export class SExperienciaService {
 expURL = 'http://localhost:8080/explab'


  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Experiecia[]>{
    return this.httpClient.get<Experiecia[]>(this.expURL + 'lista');
  }

  public detail(id: number): Observable<Experiecia>{
    return this.httpClient.get<Experiecia>(this.expURL + `detail/${id}`);
  } 

  public save(experiencia: Experiecia): Observable<any>{
    return this.httpClient.post<any>(this.expURL + 'create', experiencia);
  }

  public update(id: number, experiencia: Experiecia): Observable<any>{
    return this.httpClient.put<any>(this.expURL + `update/${id}`, experiencia);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.expURL + `delete/${id}`);
  }
}
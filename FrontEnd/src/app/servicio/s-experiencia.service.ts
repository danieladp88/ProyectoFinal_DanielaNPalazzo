import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Experiecia } from '../Model/experiecia';

@Injectable({
  providedIn: 'root'
})
export class SExperienciaService {

  expURL = 'https://backend-mgb.herokuapp.com/explab/';

  URL = environment.URL + 'explab/';


  constructor(private httpClient: HttpClient) { }

  public lista(): Observable<Experiecia[]>{
    return this.httpClient.get<Experiecia[]>(this.URL + 'lista');
  }

  public detail(id: number): Observable<Experiecia>{
    return this.httpClient.get<Experiecia>(this.URL + `detail/${id}`);
  } 

  public save(experiencia: Experiecia): Observable<any>{
    return this.httpClient.post<any>(this.URL + 'create', experiencia);
  }

  public update(id: number, experiencia: Experiecia): Observable<any>{
    return this.httpClient.put<any>(this.URL + `update/${id}`, experiencia);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.URL + `delete/${id}`);
  }
}
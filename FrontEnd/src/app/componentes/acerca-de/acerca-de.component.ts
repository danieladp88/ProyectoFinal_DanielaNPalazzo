import { Component, OnInit } from '@angular/core';
import { persona } from 'src/app/Model/persona.model';
import { PersonaService } from 'src/app/servicio/persona.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  persona: persona = new persona("","","");
    constructor(public personaServicio: PersonaService) { }

  ngOnInit(): void {
    this.personaServicio.getPesona().subscribe(data => {this.persona = data})
  }


}

import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-pokemon',
  templateUrl: './comp-pokemon.component.html',
  styleUrls: ['./comp-pokemon.component.css']
})
export class CompPokemonComponent implements OnInit {

  pokemon: any;

  constructor() { }

  async ngOnInit(): Promise<void> {
    let resp = await fetch('https://pokeapi.co/api/v2/pokemon/1');
    if (resp.status===200) {
        this.pokemon = await resp.json();

  }
this.pokemon
}
}
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { CompPokemonComponent } from './comp-pokemon/comp-pokemon.component';

@NgModule({
  declarations: [
    AppComponent,
    CompPokemonComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

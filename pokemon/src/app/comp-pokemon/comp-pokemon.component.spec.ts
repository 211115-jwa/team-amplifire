import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompPokemonComponent } from './comp-pokemon.component';

describe('CompPokemonComponent', () => {
  let component: CompPokemonComponent;
  let fixture: ComponentFixture<CompPokemonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CompPokemonComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CompPokemonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

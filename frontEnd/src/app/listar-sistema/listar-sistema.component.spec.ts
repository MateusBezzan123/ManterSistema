import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarSistemaComponent } from './listar-sistema.component';

describe('ListarSistemaComponent', () => {
  let component: ListarSistemaComponent;
  let fixture: ComponentFixture<ListarSistemaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListarSistemaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarSistemaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

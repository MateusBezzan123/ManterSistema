import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ListarSistemaComponent } from './listar-sistema/listar-sistema.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarSistemaComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

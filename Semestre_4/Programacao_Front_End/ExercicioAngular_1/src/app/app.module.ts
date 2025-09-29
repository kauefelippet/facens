import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponentComponent } from './home-component/home-component.component';
import { PostListComponentComponent } from './post-list-component/post-list-component.component';
import { PostDetailComponentComponent } from './post-detail-component/post-detail-component.component';
import { AboutComponentComponent } from './about-component/about-component.component';
import { NotFoundComponentComponent } from './not-found-component/not-found-component.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponentComponent,
    PostListComponentComponent,
    PostDetailComponentComponent,
    AboutComponentComponent,
    NotFoundComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { Routes } from '@angular/router';
import {Homescreen} from './homescreen/homescreen';
import {Products} from './products/products';

export const routes: Routes = [
  {path : "home" , component : Homescreen},
  {path : "prods" , component : Products}
];

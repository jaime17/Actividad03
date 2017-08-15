/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

/**
 *
 * @author jaime
 */
public class Binario extends fetch{
    @Override
    public int busqueda(int b){
 int inicio = 0;
 int fin = vector.length - 1;
 int centro;
 while (inicio <= fin) {
     centro = (inicio+fin) / 2;
     if ( vector[centro] == b )
       return centro;
     else if ( vector[centro] < b ) {
  inicio = centro+1;
     } else {
  fin = centro-1;
     }
 }
 return -1;
    }
}

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
public class Secuencial extends fetch {
    @Override
    public int busqueda(int b){
        for(int i=0; i<vector.length; i++){
           if (vector[i]==b){
               return i;
           }else{
                return -1;
                }
    }

    

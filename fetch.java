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
public abstract class fetch {
  int[] vector;
    
    public void setX (int x){
        vector = new int[x];
        for (int i=0; i<x-1;i++){
            vector[i] = (int) (Math.random()*100); 
        }
    }   
    public void setX(int [] x){
        this.vector = x; 
    }
    public int[] getX() 
    {
        return this.vector;
    }
    public void showV() 
    {
        for(int i=0;i<this.vector.length-1;i++)
        {
            System.out.println(this.vector[i]+", ");
        }
    }
    public void showF (int b) {
    
            System.out.println("El valor se encuentra en la posición "+b);       
        
     
    }
    
    public abstract int busqueda (int b ); 
}

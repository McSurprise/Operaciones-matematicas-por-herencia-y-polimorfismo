/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author LAB
 */
public class Potencia extends Operacion{
    public Potencia( float num1, float num2) {
        super(num1, num2);

    }
    public Potencia() {
        super();
    }
    
    public float getPotencia(float num1, float num2) {
        
 
        if(num2 == 0){
            return 1;
        }
        else{
            // caso recursivo: a^n = a *a^n-1
            return num1 * getPotencia(num1, num2 - 1);
        }      
    }    
    /////////////////////////////////////////////

    
    @Override
     public String toString(){
         return " La suma es  "+ getPotencia(this.num1 , this.num2);
     }
}

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
public class Suma extends Operacion {
    public Suma( float num1, float num2) {
        super(num1, num2);

    }
    public Suma() {
        super();
    }
    public float getSuma() {
        return getNum1()+getNum2();
    }    
    /////////////////////////////////////////////

    
    @Override
     public String toString(){
         return " La suma es  "+ getSuma();
     }
}

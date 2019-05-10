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
public class Multiplicacion extends Operacion{
    
    public Multiplicacion(float num1, float num2) {
        super(num1, num2);
    }

    public Multiplicacion() {
        super();
    }

    public float getMultiplicacion() {
        return getNum1()*getNum2();
    }

    
    /////////////////////////////////////////////
    
    @Override
     public String toString(){
        return " La multiplicacion es  "+ (getMultiplicacion());
     }
}

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
public class Division extends Operacion {


    public Division(float num1, float num2) {
        super(num1, num2);
    }

    public Division() {
        super();
    }

    public float getDivision() {
        return getNum1()/getNum2();
    }

   
    
    
    /////////////////////////////////////////////
    
    
    
    
    @Override
     public String toString(){
         if(getNum2() == 0){
             return " No se puede dividir entre 0" ;
         }else
             return " La Division es  "+ (getDivision());
     }
}

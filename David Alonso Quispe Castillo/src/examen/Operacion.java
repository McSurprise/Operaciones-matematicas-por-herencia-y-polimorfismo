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
public abstract class Operacion {
    protected float num1;
    protected float num2;

    public Operacion(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
}

///////////////////////////////////////////////

package examen;

/**
 *
 * @author LAB
 */
public class Factorial extends Operacion{
    private int numero;

    public Factorial(int numero) {
        this.numero = numero;
    }
    
    public Factorial() {
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int setFactorial(int numero){
        
        if (numero>0) {
            int valor=numero * setFactorial(numero-1);
            return valor;
        } else
            return 1; 
    }
    
    //////////////////////////////////////////////////////////
    
    
    @Override
     public String toString(){
        return " El factorial es  "+ setFactorial(this.numero);
     }
    
}





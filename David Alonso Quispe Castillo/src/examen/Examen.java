package examen;
import javax.swing.JOptionPane;

public class Examen {


    public static void main(String[] args) {
        
        int op=0;
        do{

            op = Integer.parseInt(JOptionPane.showInputDialog(null, "  MENU DE OPERACIONES  \n"
                                                + "1. SUMA\n"
                                                + "2. RESTA\n"
                                                + "3. MULTIPLICACION\n"
                                                + "4. DIVISION\n"
                                                + "5. FACTORIAL\n"
                                                + "6. POTENCIA", "op", JOptionPane.QUESTION_MESSAGE));  
            switch(op){
                case 1:
                    
                    Suma s= new Suma();
                    float num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1: ", "num1", JOptionPane.QUESTION_MESSAGE));
                    s.setNum1(num1);

                    float num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2 : ", "num2", JOptionPane.QUESTION_MESSAGE));
                    s.setNum2(num2);
                    
                    JOptionPane.showMessageDialog(null,s.toString());
                    
                    break;
                    
                case 2:
                    
                    Resta r= new Resta();
                    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1: ", "num1", JOptionPane.QUESTION_MESSAGE));
                    r.setNum1(num1);

                    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2 : ", "num2", JOptionPane.QUESTION_MESSAGE));
                    r.setNum2(num2);
                    JOptionPane.showMessageDialog(null,r.toString());
                    
                    break;
                case 3:
                    
                    Multiplicacion m= new Multiplicacion();
                    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1: ", "num1", JOptionPane.QUESTION_MESSAGE));
                    m.setNum1(num1);

                    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2 : ", "num2", JOptionPane.QUESTION_MESSAGE));
                    m.setNum2(num2);
                    JOptionPane.showMessageDialog(null,m.toString());
                    
                    break;
                
                case 4:
                    
                    Division d= new Division();
                    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 1: ", "num1", JOptionPane.QUESTION_MESSAGE));
                    d.setNum1(num1);

                    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero 2 : ", "num2", JOptionPane.QUESTION_MESSAGE));
                    d.setNum2(num2);
                    JOptionPane.showMessageDialog(null,d.toString());
                    
                    break;
                    
                case 5:
                    
                    Factorial f= new Factorial();
                    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Factorial de : ", "numero", JOptionPane.QUESTION_MESSAGE));
                    f.setNumero(numero);

                    JOptionPane.showMessageDialog(null,f.toString());
                    
                    break;
                
                case 6:
                    Potencia p = new Potencia();
                    num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Base : ", "num1", JOptionPane.QUESTION_MESSAGE));
                    p.setNum1(num1);

                    num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Exponente : ", "num2", JOptionPane.QUESTION_MESSAGE));
                    p.setNum2(num2);
                    JOptionPane.showMessageDialog(null,p.toString());    
            }
            
        }while(op!=0);
        
        
    }
    
}

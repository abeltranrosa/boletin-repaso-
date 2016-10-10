
package boletin.pkg2.pkg4;

import javax.swing.JOptionPane;


public class Boletin24 {

  
    public static void main(String[] args) {
        float num1;
        float num2;
        num1=Float.parseFloat(JOptionPane.showInputDialog("num1"));
        num2=Float.parseFloat(JOptionPane.showInputDialog("num2"));
        float suma = num1+num2;
        float resta = num1-num2;
        float producto = num1*num2;
        float cociente = num1/num2;
       JOptionPane.showMessageDialog(null, "suma ="+ suma);
       JOptionPane.showMessageDialog(null, "resta ="+ resta);
       JOptionPane.showMessageDialog(null, "producto ="+ producto);
       JOptionPane.showMessageDialog(null, "cociente ="+ cociente);

    }
    
}

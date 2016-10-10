
package boletin.pkg2.pkg2;

import javax.swing.JOptionPane;


public class Boletin22 {

  
    public static void main(String[] args) {
        double lado;
        System.out.println("teclea lado :");
        lado = Double.parseDouble(JOptionPane.showInputDialog("lado"));
        System.out.println("area = " +lado*lado);
        
        
    }
    
}

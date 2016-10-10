
package boletin.pkg2.pkg2;

import javax.swing.JOptionPane;


public class Boletin22_1 {

  
    public static void main(String[] args) {
        double lado;
        System.out.println("teclea lado :");
        lado = Double.parseDouble(JOptionPane.showInputDialog("lado"));
        System.out.println("area =" + Math.pow(lado,2));
        
        //si queremos efectuarlo como si fuera una potencia//
       // System.out.println("area = " +lado*lado);//
       // System.out.println("area =" + Math.pow(lado,2));//
        
        
    }
    
}

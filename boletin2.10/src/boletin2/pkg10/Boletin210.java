/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg10;

import javax.swing.JOptionPane;

/**
 *
 * @author antonio
 */
public class Boletin210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int bille100 ,bille20 , bille5 , total, resto;
                  
        total = (int) Float.parseFloat(JOptionPane.showInputDialog("Unidades monetarias totates (nº entero):"));
        bille100 = total/100;
        resto = total - bille100*100;
        bille20 = resto/20;
        resto = resto - bille20*20;
        bille5 = resto/5;
        resto =resto - bille5*5;
        
        
JOptionPane.showMessageDialog(null,"La cantidad de puede dividir en:\nBilletes de 100: "+bille100+"\nBilletes de 20: "+bille20+"\nBilletes de 5: "+bille5+"\nMonedas de 1:"+resto);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg9;

import javax.swing.JOptionPane;

/**
 *
 * @author antonio
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("la cantidad de dinero es:");
        float billete100;
        float billete20;
        float billete5;
        float moneda1;
        float total;
        
        billete100=Float.parseFloat(JOptionPane.showInputDialog("billete de 100 €"));
        billete20=Float.parseFloat(JOptionPane.showInputDialog("billete de 20 €"));
        billete5=Float.parseFloat(JOptionPane.showInputDialog("billete de 5 €"));
        moneda1=Float.parseFloat(JOptionPane.showInputDialog("moneda de 1 €"));
        
        total=billete100*100+billete20*20+billete5*5+moneda1*1;
        
        JOptionPane.showMessageDialog(null, "la cantidad de euros  es=" + total);
        
    }
    
}

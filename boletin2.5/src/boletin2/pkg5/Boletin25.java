/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author antonio
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Para pasar de millas náuticas a metros introduce:");
        
        final float millas_metros =1852;
        double millasNauticas;//asignacion de una constante//
   
    millasNauticas = Double.parseDouble(JOptionPane.showInputDialog("inserte millas marinas"));
        
         
    
   
System.out.println("Las " + millasNauticas + "millas náuticas en metros son " + millasNauticas * millas_metros + "m.");   

    }
    
    
}

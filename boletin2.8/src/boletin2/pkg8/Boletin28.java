/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg8;

import javax.swing.JOptionPane;

/**
 *
 * @author antonio
 */
public class Boletin28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("la temperatura en grados es:");
        
        float temperaturaCentigrados;
        float temperaturaFahrenheit;
        float temperaturaKelvin;
        
        temperaturaCentigrados=Float.parseFloat(JOptionPane.showInputDialog("grados centigrados"));
        
        temperaturaFahrenheit=temperaturaCentigrados+32;
        temperaturaKelvin=temperaturaCentigrados+273f;
        
        JOptionPane.showMessageDialog(null,"temp.fahrenheit " + temperaturaFahrenheit + "temp.Kelvin " + temperaturaKelvin);
        
       
        
    }
    
}

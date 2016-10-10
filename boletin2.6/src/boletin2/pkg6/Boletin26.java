/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg6;

import javax.swing.JOptionPane;

/**
 *
 * @author antonio
 */
public class Boletin26 {
    
   
    public static void main(String[] args) {
        System.out.println("Para calcular el descuento de esta compra introduce:");

        float precioNormal;
        float precioOferta;
        float descuento;
        
             
        precioNormal=Float.parseFloat(JOptionPane.showInputDialog("precio normal"));
        precioOferta=Float.parseFloat(JOptionPane.showInputDialog("precio oferta"));
        
        System.out.println("el porcentaje descontado de la" + precioNormal + "eur de descuento de" + (100 - precioOferta * 100 / precioNormal) + "%");
        
    }
    
}

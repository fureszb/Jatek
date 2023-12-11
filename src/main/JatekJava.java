/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import model.Targy;
import model.karakter;

/**
 *
 * @author furesz.bence
 */
public class JatekJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Targy t1 = new Targy("balta", "acél");
        karakter k1 = new karakter();
        k1.felvesz(t1, 5);
 
         k1.hasznal("balta", 3);
   }
    
}

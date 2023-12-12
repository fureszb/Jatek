package main;

import model.Targy;
import model.karakter;


public class JatekJava {

    public static void main(String[] args) {
        Targy t1 = new Targy("balta", "acél");
        karakter k1 = new karakter();
        k1.felvesz(t1, 5);
         k1.hasznal("balta", 3);
   }
    
}

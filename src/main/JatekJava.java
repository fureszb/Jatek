package main;

import model.Targy;
import model.karakter;
import model.jatek;

public class JatekJava {

    public static void main(String[] args) {
        
        run();
        
        
   }

    private static void run() {
        jatek jatek = new jatek();
        Targy t1 = new Targy("balta", "acél");
        Targy t2 = new Targy("kard", "fa");
        
        karakter k1 = new karakter("Pisti");
        karakter k2 = new karakter("Sanyi");
        
        
        k2.felvesz(t2,3);
        k2.hasznal("kard");
        
        
        k1.felvesz(t1, 2);
        k1.hasznal("balta", 1);
        
        
        jatek.addKarakter(k1);
        jatek.addKarakter(k2);
        jatek.fajlbaMentes("adatok");
        jatek.fajlbolToltes("adatok");
    }
    
    
}

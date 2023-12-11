package model;

import java.util.ArrayList;
import java.util.Random;

public class karakter {
    private int eletero, ugyesseg, szerencse;
    private ArrayList<String> felszereles;

    @Override
    public String toString() {
        return "karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszereles=" + felszereles + '}';
    }

    public karakter(ArrayList<String> felszereles) {
        this.eletero = kocka(2)+12;
        this.ugyesseg = kocka()+6;
        this.szerencse = kocka()+6;
        this.felszereles = felszereles;
    }

    public int kocka() {
        Random rnd = new Random();
        int ertek = rnd.nextInt(1, 7);
        return ertek;
    }

    public int kocka(int hanyszor) {
        Random rnd = new Random();
        int ertek = 0;
        for (int i = 0; i < hanyszor; i++) {
            ertek += rnd.nextInt(1, 7);
        }
        return ertek;
    }
    
     public void felvesz(String nev){
         felszereles.add(nev);
        System.out.println("Felvetted a "+nev+" tárgyat");
    }
    
     public void felvesz(String nev, int hanyszor){
         for (int i = 0; i < hanyszor; i++) {
              felszereles.add(nev);
             System.out.println("Felvetted a "+nev+" tárgyat");
         }
        
    }

}

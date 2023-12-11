package model;

import java.util.ArrayList;
import java.util.Random;

public class karakter {

    private int eletero, ugyesseg, szerencse;
    private ArrayList<Targy> felszereles;

    @Override
    public String toString() {
        return "karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + ", felszereles=" + felszereles + '}';
    }

    public karakter() {
        this.eletero = kocka(2) + 12;
        this.ugyesseg = kocka() + 6;
        this.szerencse = kocka() + 6;
        this.felszereles = new ArrayList<>();
    }

    public int kocka() {
        Random rnd = new Random();
        int ertek = rnd.nextInt(6) + 1;
        return ertek;
    }

    public int kocka(int hanyszor) {
        Random rnd = new Random();
        int ertek = 0;
        for (int i = 0; i < hanyszor; i++) {
            ertek += rnd.nextInt(6) + 1;
        }
        return ertek;
    }

    public void felvesz(Targy targy) {
        felszereles.add(targy);
        System.out.println("Felvetted a " + targy.getNev() + " tárgyat");
    }

    public void felvesz(Targy targy, int hanyszor) {
        for (int i = 0; i < hanyszor; i++) {
            felszereles.add(targy);
            System.out.println("Felvetted a " + targy.getNev() + " tárgyat");
        }
    }

    public void hasznal(String nev) {
        targyakTorlese(nev);
        System.out.println("Használt tárgy: " + nev);
    }

    public void hasznal(String nev, int db) {

        if (targyakSzam(nev) < db) {

            System.out.println("Nincs elégednő adott tárgyad a használathoz.");
        } else {
            targyakTorlese(nev, db);
            System.out.println("\tHasznált tárgy: " + nev + "\n\tEnnyiszer: " + db);
        }

    }

    public void hasznal(String nev, int db, boolean hasznaljukE) {
        if (hasznaljukE) {
            targyakTorlese(nev, db);
        } else {
            System.out.println("Nem használtá fel egyetlen tárgyat sem");
        }

    }

    private int targyakSzam(String nev) {
        int i = 0;
        for (Targy targy : felszereles) {
            if (targy.getNev().equals(nev)) {
                i++;
            }

        }
        return i;
    }

    private void targyakTorlese(String nev) {
        for (int i = 0; i < felszereles.size(); i++) {
            Targy targy = felszereles.get(i);
            if (targy.getNev().equals(nev)) {
                felszereles.remove(i);
                System.out.println("Tárgy eltávolítva: " + nev);
                i--;
            }
        }
    }

    private void targyakTorlese(String nev, int db) {
        int szamol = 0;

        for (int i = 0; i < felszereles.size(); i++) {
            Targy targy = felszereles.get(i);

            if (targy.getNev().equals(nev)) {
                szamol++;
                if (db >= szamol) {
                    felszereles.remove(i);
                    System.out.println("Tárgy eltávolítva: " + nev);
                    i--;
                }
            }
        }
    }

}

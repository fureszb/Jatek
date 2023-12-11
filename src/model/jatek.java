package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class jatek {
    private List<karakter> karakterek;

    public jatek() {
        this.karakterek = new ArrayList<>();
    }

    public void addKarakter(karakter karakter) {
        karakterek.add(karakter);
    }

   
    public void fajlbaMentes(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(karakterek);
            System.out.println("Jatek Mentve");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Hiba");
        }
    }

   
    public void fajlbolToltes(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            karakterek = (List<karakter>) ois.readObject();
            System.out.println("jatek betöltve");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Hiba");
        }
    }
}

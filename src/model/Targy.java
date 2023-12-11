package model;

import java.util.UUID;

public class Targy {

     private String nev, leiras;
      private UUID id;

    @Override
    public String toString() {
        return "targy{" + "nev=" + nev + ", leiras=" + leiras + ", id=" + id + '}';
    }
     
     
    public String getNev() {
        return nev;
    }

    public String getLeiras() {
        return leiras;
    }

    public UUID getId() {
        return id;
    }
   

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }
   

    public Targy(String nev, String leiras) {
        this.nev = nev;
        this.leiras = leiras;
        this.id = UUID.randomUUID();
    }
    
   
    
    
    
}

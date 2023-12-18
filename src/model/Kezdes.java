
package model;

public class Kezdes extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
       return "Tovább haladtál";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobbra();
    }
    
     @Override
    public Helyszin masikIrany() {
        return new Balra();
    }

    @Override
    public String egyikBtnFelirata() {
       return "Jobbra";
    }
 

    @Override
    public String masikBtnFelirata() {
        return "Balra";
    }

    @Override
    public String masikLeiras() {
        return "Balra mentél";
    }

    
}


package model;

public class Kezdes extends Helyszin{

    @Override
    public String leiras() {
       return "Tovább haladtál";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Balra();
    }

    @Override
    public String egyikBtnFelirata() {
       return "Tovább";
    }
    public void balra(){
    
    }
    
}

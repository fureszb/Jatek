
package model;

public class Kezdes extends Helyszin{

    @Override
    public String leiras() {
       return "Tovább haladtál";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String egyikBtnFelirata() {
       return "Tovább";
    }
    
}

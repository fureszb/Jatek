
package model;

/**
 *
 * @author furesz.bence
 */
public class Start extends Helyszin{

    @Override
    public String leiras() {
        return "Ez a Start! Haladj tovább!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();     
    }

    @Override
    public String egyikBtnFelirata() {
       return "Tovább...";   }
    
}

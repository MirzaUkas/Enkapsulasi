
package Praktikum;
/**
 *
 * @author MirzaUY
 */


public class testBola {
    public static void main(String[]arg){
    
    Bola hitung = new Bola();
    double luas,volume;
    hitung.setJari(7);
    luas = hitung.LuasPermukaan();
    volume = hitung.showVolume();
    System.out.println(" Jari-Jari = " + hitung.showJari() + "\n Diameter = " 
            + hitung.showDiameter() + "\n Luas = " 
            +(int)Math.round(luas) + "\n Volume = " +(int)Math.round(volume));
    
    }
}

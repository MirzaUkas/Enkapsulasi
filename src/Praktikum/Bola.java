package Praktikum;
/**
 *
 * @author MirzaUY
 */
public class Bola {
    public double jari;
    
    public void setJari(double r){
    jari = r; // jari =7
    }
    public double showJari(){
    return jari; 
    }
    //Diameter
    public double showDiameter(){
    double diameter = jari*2;
    return diameter;
    }
    //Volume
    public double showVolume(){
    double volume;
    volume = (4 * Math.PI*jari*jari*jari)/3;
    return volume;
    }
    //Luas
    public double LuasPermukaan(){
    double luas;
    luas =4*Math.PI*jari*jari;
    return luas;
    }
}

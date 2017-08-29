package Latihan3;
/**
 *
 * @author MirzaUY
 */
public class EncapSiswa {
    private String name,addres;
    private int absen;
    public int getAbsen(){
    return absen;
    }
    public String getName(){
    return name;
    }
    public String getAddress(){
    return addres;
    }
    public void setAbsen(int newAbsen){
    absen = newAbsen;
    }
    public void setName(String newName){
    name=newName;
    }
    public void getAddress(String newAddress){
    addres  =newAddress;
    }
}

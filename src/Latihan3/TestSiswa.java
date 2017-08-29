package Latihan3;
/**
 *
 * @author MirzaUY
 */
public class TestSiswa {
  public static void main(String args[]){
  EncapSiswa siswa = new EncapSiswa();
  siswa.setName("Mirza");
  siswa.setAbsen(22);
  siswa.getAddress("Malang");
  
  System.out.println("Name : " + siswa.getName()
          + "\nAbsen : " + siswa.getAbsen() 
          + "\nAddress : " + siswa.getAddress());
  }  
}

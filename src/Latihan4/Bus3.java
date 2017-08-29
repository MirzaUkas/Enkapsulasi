package Latihan4;
/**
 *
 * @author MirzaUY
 */
public class Bus3 {
     private int penumpang;
     private int maxPenumpang;
     //kunstruktor
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang =0;
    }
    
    //method mutator untuk menambahkan penumpang
    public void addPenumpang(int penumpang){
    int temp;
    temp = this.penumpang+penumpang;
    if(temp >= maxPenumpang){
    System.out.println("Penumpang melebihi kuota");
    }else{
    this.penumpang = temp;
      }
    }
    //method autentikasi
    public void getPenumpang(int password){
    if (password == 24){
    System.out.println("Password Benar");
    }else{
    System.out.println("Password Salah");
    }
    }
    //method cetak
    public void cetak(){
    System.out.println("Penumpang Bus Sekarang adalah " +penumpang);
    System.out.println("Penumpang Maksimum Bus Seharusnya " +maxPenumpang);
    }
}

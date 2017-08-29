package Latihan1;
/**
 *
 * @author MirzaUY
 */
public class UjiBus {
    public static void main(String[] arg){
        //Membuat Objek busMini
     Bus busMini = new Bus();
        //Memasukkan nilai pada variabel
     busMini.penumpang=5;
     busMini.maxPenumpang=15;
        //Memanggil Method cetak pada class Bus
     busMini.cetak();
        
        //tambah penumpang
     busMini.penumpang+=5;
     busMini.cetak();
        
        //kurangi penumpang
    busMini.penumpang-=2;
    busMini.cetak();
    
        //tambah penumpang
    busMini.penumpang+=8;
    busMini.cetak();
    }
}

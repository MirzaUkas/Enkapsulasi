package Latihan4;
/**
 *
 * @author MirzaUY
 */
public class UjiBus3 {
    public static void main(String[] arg){
    Bus3 bus = new Bus3(5);
    bus.getPenumpang(17);
    bus.getPenumpang(24);
    //tambah 2
    bus.addPenumpang(2);
    bus.cetak();
    //tambah 1
    bus.addPenumpang(1);
    bus.cetak();
    //tambah 2
    bus.addPenumpang(2);
    bus.cetak();
    //tambah 2
    bus.addPenumpang(2);
    bus.cetak();
    }
}

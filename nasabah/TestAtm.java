/**
 * Created by LENOVO on 18-Jun-15.
 */
public class TestAtm {

    public static void main(String[] args) {
        Rekening aa = new Rekening(35000000.0);
        Nasabah bb = new Nasabah("Ucup","Dwi",aa);
        System.out.println(bb);
        bb.setAccount(aa);

        System.out.println(bb.toString());

        aa.tarik(9000000.00);

        System.out.println("tarik Rp. 9000000.00");
        System.out.println("tampilkan saldo sekarang = " + aa.getSaldo());

        aa.setor(9000000.00);

        System.out.println("setor Rp. 9000000.00");
        System.out.println("tampilkan saldo sekarang = " + aa.getSaldo());
    }
}

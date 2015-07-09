/**
 * Created by LENOVO on 06-Jul-15.
 */
public class TestLiga {

    public static void main(String[] args) {

        Liga INDONESIA = new Liga("INDONESIA");

        Divisi ISL = new Divisi("Divisi ISL");
        Divisi Utama = new Divisi("Utama");

        Klub ISL1 = new Klub("AREMAFC",ISL,INDONESIA);
        Klub ISL2= new Klub("PERSEBAYA1997",ISL,INDONESIA);
        Klub Utama1 = new Klub("PERSIK",Utama,INDONESIA);
        Klub Utama2 = new Klub("PERSIWA",Utama,INDONESIA );

        INDONESIA.setDaftarDivisi(ISL);
        INDONESIA.setDaftarDivisi(Utama);

        INDONESIA.setDaftarKlub(ISL1);
        INDONESIA.setDaftarKlub(ISL2);
        INDONESIA.setDaftarKlub(Utama1);
        INDONESIA.setDaftarKlub(Utama2);

        ISL.setDaftarKlub(ISL1);
        ISL.setDaftarKlub(ISL2);
        Utama.setDaftarKlub(Utama1);
        Utama.setDaftarKlub(Utama2);

        System.out.println("Liga : " + INDONESIA.getNamaLiga());
        System.out.println("Divisi : " + INDONESIA.getDaftarDivisi());

        System.out.println("\n");

        System.out.println("Liga : " + INDONESIA.getNamaLiga());
        System.out.println("Klub : " + INDONESIA.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " + INDONESIA.getNamaLiga());
        System.out.println("Klub : " + Utama.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " + INDONESIA.getNamaLiga());
        System.out.println("Klub : " + ISL.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " + INDONESIA.getNamaLiga());
        System.out.println("Klub : " + INDONESIA.getDaftarKlub());
        System.out.println("\n");
        System.out.println("Liga : " + ISL1.getLiga());
        System.out.println("Klub : " + ISL1.getNamaKlub());
        System.out.println("Divisi : " + ISL1.getDivisi());
        System.out.println("\n");
        System.out.println("Liga : " + ISL2.getLiga());
        System.out.println("Klub : " + ISL2.getNamaKlub());
        System.out.println("Divisi : " + ISL2.getDivisi());
        System.out.println("\n");
        System.out.println("Liga : " + Utama1.getLiga());
        System.out.println("Klub : " + Utama1.getNamaKlub());
        System.out.println("Divisi : " + Utama1.getDivisi());
        System.out.println("\n");
        System.out.println("Liga : " + Utama2.getLiga());
        System.out.println("Klub : " + Utama2.getNamaKlub());
        System.out.println("Divisi : " + Utama2.getDivisi());
        System.out.println("\n");

        System.out.println("Liga : " + INDONESIA.getNamaLiga());
        System.out.println("Klub : " + INDONESIA.getDaftarKlub());
        System.out.println("\n");
}
}

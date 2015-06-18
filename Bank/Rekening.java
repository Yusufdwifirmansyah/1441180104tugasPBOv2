/**
 * Created by LENOVO on 18-Jun-15.
 */
public class Rekening {

    private Double saldo;

    public Rekening() {
    }

    public Rekening(double saldo) { this.saldo = saldo; }

    public  double getSaldo() { return  saldo; }

    public void setSaldo(Double saldo) { this.saldo = saldo; }

    public void  tarik (double tarik) { this.saldo = saldo - tarik;}

    public void  setor (double setor) { this.saldo = saldo + setor;}

    @Override
    public String toString() {
        return "Rekening{" +
                "saldo=" + saldo +
                '}';
    }
}

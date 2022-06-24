public class bankSys {

    private double saldo=5000;
    private double wyplata;

    private double sejf=1000000;


    public bankSys(){

    }

 public double getSaldo(){
        return saldo;
 }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getWyplata() {
        return wyplata;
    }

    public void setWyplata(double wyplata) {
        this.wyplata = wyplata;
    }

    public double getSejf() {
        return sejf;
    }

    public void setSejf(double sejf) {
        this.sejf = sejf;
    }
}

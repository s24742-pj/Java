public class ImplementacjaBanku implements InterfaceBanku {
    bankSys konto=new bankSys();
    bankSys sejf=new bankSys();





    public void zobaczSaldo() {
        System.out.println("Dostepne srodki na koncie: "+ konto.getSaldo()+"zl");


    }

    @Override
    public void zobaczSaldo2() {
        System.out.println("Pozostale saldo na koncie: "+ konto.getSaldo()+"zl");

    }

    @Override
    public void kwotaWyplaty(double kwotaWyplaty) {
        if(sejf.getSejf()>0) {
            if(kwotaWyplaty< sejf.getSejf()) {
                if (kwotaWyplaty <= konto.getSaldo()) {
                    konto.setSaldo(konto.getSaldo() - kwotaWyplaty);
                    zobaczSaldo2();
                    System.out.println("Dziekujemy za skorzystanie z bankomatu\nOdbierz karte oraz pieniadze: " + kwotaWyplaty + "zl");
                    System.exit(0);
                } else {
                    System.out.println("Nie masz tylu srodkow");
                }
            }else{
                System.out.println("przepraszamy nie ma tylu pieniedzy w bankomacie prosimy wybrac mniejsza kwote do wyplaty");
            }
        }else{
            System.out.println("Brak pieniadzy w bankomacie, zostanie on zablokowany");
            System.exit(0);
        }




    }
}

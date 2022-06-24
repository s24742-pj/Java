import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceBanku op=new ImplementacjaBanku();
        int pin = 1234;
        int proba = 3;


        System.out.println("Witaj w bankomacie Szmelleniu\n Podaj pin do wprowadzonej karty");



        for (int i = 0; i < 3; i++) {


            Scanner in = new Scanner(System.in);

            int pin2 = in.nextInt();
            if (pin == pin2) {
                while(true){
                    System.out.println("1.Sprawdz Saldo Konta\n 2.Wyplac pieniadze \n 3.Wyjdz");
                    System.out.println("Wybierz opcje: ");
                    int opc=in.nextInt();
                    if(opc==1){
                        op.zobaczSaldo();

                    }
                    if(opc==2){
                        System.out.println("Podaj kwote do wypłaty");
                        double kwotaWyplaty=in.nextDouble();
                        op.kwotaWyplaty(kwotaWyplaty);


                    }
                    if(opc==3){
                        System.out.println("Dziekujemy za skorzystanie z bankomatu. Odbierz swoja karte");

                    }
                    else{
                        System.out.println("Wybierz prawidlowa opcje");
                    }
                }


            } else {
                proba--;
                System.out.println("Pin nieprawidlowy\n pozostale proby: " + proba);
            }
            if(proba<=0){
                System.out.println("Wykorzystano wszystkie proby, konto zablokowane");
                System.exit(0);
            }


        }
    }
}
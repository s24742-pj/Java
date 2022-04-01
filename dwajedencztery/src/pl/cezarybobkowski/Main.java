package pl.cezarybobkowski;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int liczba;

        System.out.println("podaj dowolna liczbe");

        liczba = scanner.nextInt();

         if (parzystosc.czyLiczbaJestParzysta(liczba)) {
             System.out.println("parzysta");
         }else{
             System.out.println("nie parzysta");
         }


    }
}

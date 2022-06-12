package pl.zadanie3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class Coffee {
    public static void main(String[] args) {
        ArrayList<String> coffee = new ArrayList<String>();
        coffee.add("espresso");
        coffee.add("latte");
        coffee.add("cappuccino");
        coffee.add("mocha");
        coffee.add("auLait");
        coffee.add("macchiato");

        Iterator<String> coffe = coffee.iterator();
        System.out.println(coffee);



        for (int i = 0; i < 6; i++)
            System.out.println(coffe.next());

        System.out.println("----------------");

        for(String n : coffee)
            System.out.println(n.toUpperCase(Locale.ROOT));

        System.out.println("----------------");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(coffee.get(i).charAt(j));
            }
            System.out.println();
        }

    }
}
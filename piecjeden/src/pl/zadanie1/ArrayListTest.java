package pl.zadanie1;

import java.util.ArrayList;

public class ArrayListTest {
    public ArrayListTest() {
    }

    public static void main(String[] args) {
        long milisekundy = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();

        int i;
        for(i = 0; i < 100; i += 2) {
            arrayList.add(i);
        }

        for(i = 0; i < 50; ++i) {
            System.out.println(arrayList.get(i));
        }

        long czaswykonania = System.currentTimeMillis() - milisekundy;
        System.out.println("" + czaswykonania + "milisekund");
    }
}
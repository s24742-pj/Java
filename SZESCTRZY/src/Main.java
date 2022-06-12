import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> tree1 = new TreeSet<String>();

        tree1.add("Bialy");
        tree1.add("Czarny");
        tree1.add("Fioletowy");
        tree1.add("Niebieski");
        tree1.add("Zolty");

        System.out.println("tree1: " + tree1);

        Iterator<String> tree1it = tree1.iterator();
        for (String elemnt:tree1){
            System.out.println(tree1it.next());
        }


        TreeSet<String> tree2 = new TreeSet<String>();
        tree2.add("Czerwony");
        tree2.add("Brazowy");
        tree2.add("Rozowy");


        tree1.addAll(tree2);
        System.out.println("Suma tree: "+tree1);


        System.out.println("Odwrotna kolejnosc: " + tree1.descendingSet());

        System.out.println("Pierwszy element: "+ tree1.first() + ", Ostatni element: "+ tree1.last());

        TreeSet<String> tree3 = (TreeSet) tree1.clone();

        System.out.println("Tr3 "+ tree3);

        System.out.println("Elementy w 1: "+tree1.size());





    }
}
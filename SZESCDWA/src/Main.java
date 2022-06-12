
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {

        HashSet<String> list = new HashSet<String>();
        list.add("banan");
        list.add("brzoskwinia");
        list.add("jablko");
        list.add("cytryna");
        list.add("winogorono");
        list.add("mandarynka");
        list.add("arbuz");
        list.add("mango");
        System.out.println(list);

        String[] tab = new String[list.size()];

        int i=0;

        for (String element:list){
            tab[i++] =element;
        }
        for(String element:tab){
            System.out.println(element);
        }





    }
}
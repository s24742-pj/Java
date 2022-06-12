import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 12: ");
        int x = scanner.nextInt();
        HashMap<Integer, String> month =new HashMap<Integer, String>();
        month.put(1, "january");
        month.put(2, "february");
        month.put(3, "march");
        month.put(4, "april");
        month.put(5, "may");
        month.put(6, "june");
        month.put(7, "july");
        month.put(8, "august");
        month.put(9, "september");
        month.put(10, "octover");
        month.put(11, "november");
        month.put(12, "december");

        if (x<13 && x>0){
            System.out.println("Twoj miesiac: " +month.get(x));
        }else{
            System.out.println("Podales zla liczbe");
        }












    }
}
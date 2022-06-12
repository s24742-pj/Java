import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Mercedes");
        list.add("Lambo");
        list.add("Porshe");
        list.add("BMW");
        list.add("Honda");
        list.add("McLaren");
        list.add("Bugatti");

        System.out.println("Orginalna Lista - " +list);
        System.out.println("----------------");
        System.out.println("Usuniete z niej elementy- "+list.removeFirst()+list.removeLast());
        System.out.println("----------------");
        System.out.println("Nowa lista- "+list);



    }
}
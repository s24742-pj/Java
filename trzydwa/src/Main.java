public class Main {
    public static void main(String[] args) {

        Author author = new Author("bogdan","bigos", 102);
        author.setSurname("jezioro");

        Author author2 = new Author("bogdan","bigos", 102);
        author.setSurname("rzeka");


        System.out.println(author);
        System.out.println(author2);








    }
}
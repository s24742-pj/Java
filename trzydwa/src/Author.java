public class Author {

    private String name;
    private String surname;
    private int age;


    public Author (String name, String surname, int age){

        this.age=age;
        this.name=name;
        this.surname=surname;

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString(){
        String infoAuthor = "Imie: "+this.name+" , nazwisko: "+this.surname+" , wiek: "+this.age;

        return infoAuthor;

    }


}

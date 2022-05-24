package Lab3;

class Author{
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}


public class TestAuthor {
    public static void main(String[] args){
        Author author1 = new Author("Bolesław","Prus",55);
        Author author2 = new Author("Bolesław","Leśmian",55);
        Author author3 = new Author("Eliza","Orzeszkowa",34);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);
        System.out.println("Name: " + author3.getName() + " age: " + author3.getAge());

    }
}

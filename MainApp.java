// Main.java
public class MainApp {
    public static void main(String[] args) {
        Person person = new Person();

        // setters
        person.setName("ajit");
        person.setAge(25);
        person.setCountry("India");

        //  getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
    }
}

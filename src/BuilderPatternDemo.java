import com.DesignPattern.Creational.builder.Person;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        // Creating a Person object using the Builder
        Person person1 = new Person.Builder("John", "Doe")
                .age(30)
                .address("123 Main St")
                .phoneNumber("555-1234")
                .build();

        // Creating another Person object with different optional parameters
        Person person2 = new Person.Builder("Jane", "Smith")
                .address("456 Elm St")
                .build();

        // Printing the Person objects
        System.out.println(person1);
        System.out.println(person2);
    }
}

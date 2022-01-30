package creational.builderimmutable;

public class PersonDemo {
    public static void main(String[] args) {
        //PersonBuilder instance is initiated
        Person.PersonBuilder builder = new Person.PersonBuilder();

        //builder builds the instance
        builder.id(1).name("Name").age(5);

        //Immutable Person object is initiated by build()
        Person person = builder.build();

        System.out.println(person);
    }
}

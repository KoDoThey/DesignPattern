package creational.builderimmutable;

public final class Person {

    //All fields are final to immutable object
    private final int id;
    private final String name;
    private final int age;

    //Constructor is private, so only static PersonBuilder can initiate Person instance
    private Person(PersonBuilder personBuilder) {
        this.id = personBuilder.getId();
        this.name = personBuilder.getName();
        this.age = personBuilder.getAge();
    }

    public static class PersonBuilder {

        //Variables of PersonBuilder are temporary storage to create Immutable Person instance
        private int id;
        private String name;
        private int age;

        PersonBuilder() {
        }

        //to initiate Person instance
        Person build() {
            return new Person(this);
        }

        //constructors for each variable
        public PersonBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        //getter use in private constructor of Person class
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Id:\t\t%d\nName:\t%s\nAge:\t%s\n"
                , id, name, age);
    }

}

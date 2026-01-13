package classobject;

public class Person {
    String name;
    int age;

    Person(String name) {
        this.name = name;
    }

    Person(String name,int age) {
        this(name);
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person("Raj",22);
        System.out.println(p.name + " " + p.age);
    }
}


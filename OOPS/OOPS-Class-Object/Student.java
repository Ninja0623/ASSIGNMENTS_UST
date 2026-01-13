package classobject;

public class Student {
    int id;
    String name;

    void displayDetails() {
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 101;
        s.name = "Arun";
        s.displayDetails();
    }
}


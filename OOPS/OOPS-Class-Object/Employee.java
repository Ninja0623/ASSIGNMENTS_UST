package classobject;

public class Employee {
    int empId;
    String empName;
    double salary;

    Employee() {
        empId = 1;
        empName = "Ravi";
        salary = 25000;
    }

    void display() {
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}


package classobject;

public class StudentAdmission {
    String type;

    StudentAdmission() {
        type = "General Admission";
    }

    StudentAdmission(String merit) {
        type = merit;
    }

    void show() {
        System.out.println(type);
    }

    public static void main(String[] args) {
        StudentAdmission s1 = new StudentAdmission();
        StudentAdmission s2 = new StudentAdmission("Management Admission");
        s1.show();
        s2.show();
    }
}

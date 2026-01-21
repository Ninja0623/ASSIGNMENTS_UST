package classobject;

public class User {
    String email;
    String password;

    User(String email) {
        this.email = email;
        password = "Not Set";
    }

    User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    void show() {
        System.out.println(email);
        System.out.println(password);
    }

    public static void main(String[] args) {
        User u1 = new User("test@mail.com");
        User u2 = new User("admin@mail.com", "1234");
        u1.show();
        u2.show();
    }
}
package classobject;

public class Book {
    String title;
    String author;
    Book() {
        title = "Java Basics";
        author = "James";
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println(title + " by " + author);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Python", "Guido");
        b1.display();
        b2.display();
    }
}

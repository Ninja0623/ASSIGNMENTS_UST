package classobject;

public class LibraryBook {
    int bookId;
    String title;
    String author;
    boolean available;

    LibraryBook(int bookId,String title,String author,boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    boolean isAvailable() {
        return available;
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook(1,"C Programming","Dennis",true);
        System.out.println(b.isAvailable());
    }
}


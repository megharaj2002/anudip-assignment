import java.util.ArrayList;
import java.util.List;

class Book {
    int bookId;
    String bookName;
    String authorName;

    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + "]";
    }
}

public class BookArrayList {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(101, "let us c", "Yashavant P Kanetkar"));
        books.add(new Book(102, "head first java ", "Kathy Sierra"));

        System.out.println("--All Books--");
        for (Book b : books) {
            System.out.println(b);
        }
    }
}

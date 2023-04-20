import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Library {

    private ArrayList<Book> books;// applying encapsulation
    private Date dueDate;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String ISBN) {
        for (Book book : books) {
            if (book.ISBN.equals(ISBN)) {
                books.remove(book);
                break;
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Availability: " + book.availability);
           // System.out.println("Date: " + book.date);
            System.out.println();
        }
    }


    public void displayBorrowedBooks()
    {
        for (Book book : books) {
            if (!book.availability) {
                System.out.println("Title: " + book.title);
                System.out.println("Date borrowed: "+ book.date);
                System.out.println("Due Date: " + book.getDueDate());

            }
        }
    }

    public void overdueBooks() {
        Date currentDate = new Date();
        for (Book book : books) {
            if (book.getDueDate().compareTo(currentDate) < 0) {
                System.out.println("Title: " + book.title);
                System.out.println("Date borrowed: " + book.date);
                System.out.println("Due Date: " + book.getDueDate());
            }
        }
    }



    public Book getBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;  // Book not found
    }

    // Getters and Setters for the private variables
    //public so that other classes can retrieve the collection of books held by the library.
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}

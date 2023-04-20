
import java.util.Date;

public class Book {
    String title;
    String author;
    String ISBN;
    boolean availability;

    Date date = new Date();

    private Date dueDate;




    public Book(String title, String author, String ISBN, boolean availability) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.availability = availability;
        //this.date=date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.ISBN = isbn;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Date date(Date date) {
        Date date1 = this.date;
        return date1;
    }


    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.ISBN;
    }

    public boolean getAvailability() {
        return this.availability;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

}

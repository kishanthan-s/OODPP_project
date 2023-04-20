import java.util.Calendar;
import java.util.Date;

public class BorrowBook {


    // applying encapsulation
    public boolean borrowBook(String isbn, Library library) {
        Book book = library.getBook(isbn);
        if (book != null && book.getAvailability()) {
            book.setAvailability(false);
            //library.removeBook(book.ISBN);
            book.date(new Date());
            book.setDueDate(calculateDueDate());
            return true;
        } else {
            return false;
        }
    }


    public Date calculateDueDate() {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.SECOND, 30);
        return c.getTime();
    }

}

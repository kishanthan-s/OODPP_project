import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    Scanner scanner = new Scanner(System.in);
    Library library = new Library();

    while (true) {
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. Display Books");
        System.out.println("4. Borrow book");
        System.out.println("5. Return book");
        System.out.println("6. Display borrowed books");
        System.out.println("7. Display overdue books");
        System.out.println("8. Exit");

        int choice = scanner.nextInt();

        if (choice == 1) {
            scanner.nextLine(); // to consume the newline character
            System.out.print("Enter title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            System.out.print("Enter ISBN: ");
            String ISBN = scanner.nextLine();
            System.out.print("Enter availability: ");
            boolean availability = scanner.nextBoolean();
            library.addBook(new Book(title, author, ISBN, availability));
        } else if (choice == 2) {
            scanner.nextLine(); // to consume the newline character
            System.out.print("Enter ISBN: ");
            String ISBN = scanner.nextLine();
            library.removeBook(ISBN);
        } else if (choice == 3) {
            library.displayBooks();
        } else if (choice == 4) {
            scanner.nextLine(); // to consume the newline character
            System.out.print("Enter ISBN number: ");
            String ISBN = scanner.nextLine();
            BorrowBook borrower = new BorrowBook();
            boolean success = borrower.borrowBook(ISBN, library);
            if (success) {
                System.out.println("Book successfully borrowed!");
            } else {
                System.out.println("Book could not be borrowed.");
            }
           // library.removeBook(ISBN);
        } else if (choice == 5) {
            scanner.nextLine();
            System.out.print("Enter ISBN number: ");
            String ISBN = scanner.nextLine();
            ReturnBook returner = new ReturnBook();
            boolean success = returner.returnBook(ISBN, library);
            if (success) {
                System.out.println("Book successfully returned!");
            } else {
                System.out.println("Book could not be returned.");
            }

        } else if (choice == 6) {
            library.displayBorrowedBooks();
        } else if (choice == 7) {
            library.overdueBooks();
        } else if (choice == 8) {
            break;
            }
    }

        scanner.close();
}

}
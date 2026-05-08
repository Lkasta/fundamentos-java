import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Rent> rents = new ArrayList<>();

    public Library() {
        initializeLibrary();
    }

    private void initializeLibrary() {
        Author author1 = new Author();
        author1.setId(1);
        author1.setName("Mauricio de Souza");
        author1.setBirthDate(LocalDate.of(1839, 6, 21));

        Author author2 = new Author();
        author2.setId(2);
        author2.setName("Chris Rock");
        author2.setBirthDate(LocalDate.of(1903, 6, 25));

        Author author3 = new Author();
        author3.setId(3);
        author3.setName("Dick Rowling");
        author3.setBirthDate(LocalDate.of(1965, 7, 31));

        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        Book book1 = new Book();
        book1.setId(1);
        book1.setTitle("Jonas");
        book1.setAuthor(author1);
        book1.setAvailable(true);
        book1.setRegisterAt(LocalDate.now());
        book1.setLastUpdate(LocalDate.now());

        Book book2 = new Book();
        book2.setId(2);
        book2.setTitle("1984");
        book2.setAuthor(author2);
        book2.setAvailable(true);
        book2.setRegisterAt(LocalDate.now());
        book2.setLastUpdate(LocalDate.now());

        Book book3 = new Book();
        book3.setId(3);
        book3.setTitle("Harry Potter");
        book3.setAuthor(author3);
        book3.setAvailable(true);
        book3.setRegisterAt(LocalDate.now());
        book3.setLastUpdate(LocalDate.now());

        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable books:");

        boolean hasAvailableBook = false;

        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("--------------------------------------------------");
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor().getName());

                hasAvailableBook = true;
            }
        }

        if (!hasAvailableBook) {
            System.out.println("No available books at the moment.");
        }
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }

        return null;
    }

    public void rentBook(int bookId, String clientName) {
        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("This book is already rented.");
            return;
        }

        Rent rent = new Rent();
        rent.setId(rents.size() + 1);
        rent.setBook(book);
        rent.setClientName(clientName);
        rent.setRentedAt(LocalDate.now());
        rent.setReturnedAt(null);

        rents.add(rent);

        book.setAvailable(false);
        book.setLastUpdate(LocalDate.now());

        System.out.println("\nRental completed successfully!");
        System.out.println("Book: " + book.getTitle());
        System.out.println("Client: " + clientName);
        System.out.println("Rental Date: " + rent.getRentedAt());
    }
}
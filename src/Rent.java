import java.time.LocalDate;

public class Rent {
    private long id;
    private Book book = new Book();
    private String clientName;
    private LocalDate rentedAt;
    private LocalDate returnedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public LocalDate getRentedAt() {
        return rentedAt;
    }

    public void setRentedAt(LocalDate rentedAt) {
        this.rentedAt = rentedAt;
    }

    public LocalDate getReturnedAt() {
        return returnedAt;
    }

    public void setReturnedAt(LocalDate returnedAt) {
        this.returnedAt = returnedAt;
    }
}
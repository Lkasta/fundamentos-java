import java.time.LocalDate;

public class Book {
    private int id;
    private String title;
    private Author author = new Author();
    private boolean available;
    private LocalDate registerAt;
    private LocalDate lastUpdate;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public LocalDate getRegisterAt() {
        return registerAt;
    }

    public void setRegisterAt(LocalDate registerAt) {
        this.registerAt = registerAt;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}

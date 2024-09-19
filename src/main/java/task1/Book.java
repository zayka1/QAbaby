package task1;

public class Book implements Displayable {
    private String title;
    private int year;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void display() {
        System.out.println("Название книги - " + getTitle() + "; Автор - " + getAuthor() + "; Год издания - " + getYear());
    }
}

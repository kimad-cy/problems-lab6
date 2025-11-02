package problem3;

public class Book extends Document {
    protected String author;
    protected int nbrPages;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }
    public int getNbrPages() {
        return nbrPages;
    }

    public Book(String title, String author, int nbrPages) {
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }

    @Override
    public String toString() {
        return super.toString() + " | Book: [author: " + author + ", nbrPages: " + nbrPages + "]";
    }
}

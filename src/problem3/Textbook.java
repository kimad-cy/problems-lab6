package problem3;

public class Textbook extends Book {
    private String level;

    public Textbook(String title, String author, int nbPages, String level) {
        super(title, author, nbPages);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString() + " | Textbook [level=" + level + "]";
    }
}

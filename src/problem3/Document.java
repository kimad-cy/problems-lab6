package problem3;

public class Document {
    private int numRec;
    protected String title;
    public Document(String title){
        this.title = title;
    }
    public int getNumRec() {
        return numRec;
    }

    public void setNumRec(int numRec) {
        this.numRec = numRec;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Document [" + "numRec: " + numRec + ", title:" + title + ']';
    }
}

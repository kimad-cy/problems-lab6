package problem3;

public class Magazine extends Document{
    private String month;
    private int year;

    public Magazine(String title, String month, int year){
        super(title);
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return super.toString() + " | Magazine: [month: " + month + ", year: " + year + "]";
    }
}

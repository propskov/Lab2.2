package File;
//Документ
public class Doc extends File {
    private int page;

    public Doc(String name, int size, String format,String description, int page) {
        super(name, size, format,description);
        setPage(page);
    }


    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }

    public String toString() {
        return String.format("|%-18s|", getName() + getFormat()) + String.format("%-14s |", getSize()) + String.format("%-34s             |%n", getDescription()+ ", " + getPage() + " pages" );
    }

}

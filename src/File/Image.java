package File;

public class Image extends File {
    private Scale scale;// Scale - ширина х высота


    public Image(String name, int size, String format, String description, int wight, int height) {
        super(name, size, format, description);
        scale = new Scale(wight, height);
    }

    public String toString() {
        return String.format("|%-18s |", getName() + getFormat()) + String.format("%-14s |", getSize()) + String.format("%-34s             |%n", getDescription() + ", " + scale.getWidth() + "x" + scale.getHeight());
    }


}

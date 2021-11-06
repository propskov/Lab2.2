package File;

public class Media extends File {
    private String description;// description - описание контента в файле
    private Duration duration; //duration - длительность файла мультимедиа

    public Media(String name, int size, String format, String description, int hour, int minute, int second) {
        super(name, size, format, description);
        setDescription(description);
        duration = new Duration( hour, minute, second);
    }

    public String getDescription() {
        return description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String toString() {
        return String.format("|%-18s |", getName() + getFormat()) + String.format("%-14s |", getSize()) + String.format("%-34s             |%n", getDescription() +", " +  duration.getMinute() + ":" + duration.getSecond());
    }

}

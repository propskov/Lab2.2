package File;
public class Video extends Media{
    private Scale scale;// Scale - ширина х высота
    Duration duration;
    public Video(String name, int size, String format, String description,int wight,int height,int hour, int minute,int second){
        super(name, size, format, description,hour,minute,second);
        scale = new Scale(wight, height);
        duration = new Duration( hour, minute, second);
    }

    @Override
    public String toString() {
        return String.format("|%-18s|", getName() + getFormat()) + String.format("%-14s |", getSize()) + String.format("%-34s |%n", getDescription() +", " +duration.getHour() +":" +   duration.getMinute() + ":" + duration.getSecond()+ "," +  + scale.getWidth() + "x" + scale.getHeight());
    }


}

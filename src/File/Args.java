package File;

public class Args {
    public static void main(String[] args) {
        File[] file = new File[]{
                new Doc("j110-lab2-hiers", 23_212, ".doc", "docx", 2),
                new Image("spb-map", 1_703_527, ".png", "image", 1024, 3072),
                new Media("06-PrettyGirl", 7_893_454, ".mp3", "audio, E.Clapton,Pretty Girl", 0, 05, 28),
                new Video("BackToTheFuture", 1_470_984_192, ".avi", "video,Back to the future1,1985", 640, 352, 01, 48, 8)
        };
        File.printAll(file);
        System.out.println();

        Media[] myfile = new Media[]{
                new Media("Intro", 1211_212, ".flac", "audio, альбом 'Absolution'", 0, 0, 22),
                new Media("Hysteria", 11_562_212, ".flac", "audio,альбом 'Absolution'", 0, 4, 12),
                new Media("Endlessly", 14_2345_212, ".flac", "audio,альбом 'Absolution'", 0, 3, 49),
        };
        Media.printAll(myfile);

    }
}

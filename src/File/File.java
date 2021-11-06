package File;
public abstract class File {
    private String name;
    private int size;
    private String format;
    private String description;

    //image
    public File(String name, int size, String format,String description) {
        setName(name);
        setSize(size);
        setFormat(format);
        setDescription(description);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getFormat() {
        return format;
    }

    public void setName(String name) {
        if(name != null && ! name.equals(""))
        this.name = name;
        else
            throw new IllegalArgumentException("Поле имя не должно быть пустым");
    }

    public void setSize(int size) {
        if (size <= 0)
            throw new IllegalArgumentException("Размер файла должен быть больше нуля");
        this.size = size;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




        @Override
        public  abstract String toString();




    public static void printAll(File[] file){
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.printf("| %-18s| %-14s| %-34s            |%n","     File name","     Size" ,"      Details    ");
        System.out.println("+-----------------------------------------------------------------------------------+");
        for (File f:file){
            System.out.println(f.toString());
        }
        System.out.println("+-----------------------------------------------------------------------------------+");
    }

    public static void printAll(Media[] myfile){
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.printf("| %-18s|%-14s| %-34s             |%n","     File name","     Size" ,"      Details    ");
        System.out.println("+-----------------------------------------------------------------------------------+");
        for (File f:myfile){
            System.out.println(f.toString());
        }
        System.out.println("+-----------------------------------------------------------------------------------+");
    }

}




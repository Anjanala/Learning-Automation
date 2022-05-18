import java.io.File;

public class File1 {
    public static void main(String[] args) {
        try {
            File f = new File("sitename.txt");

            if (f.createNewFile()) {
                System.out.println("File is successfully " + f.getName());
            } else {
                System.out.println("Seems like file already exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred. "+e.getMessage());
        }
    }
}

import java.net.URL;
import java.util.Scanner;

public class GetContent {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String url = scr.next();
        readContent(url);
    }

    private static void readContent(String dest) {
        try {
            URL url = new URL(dest);
            System.out.println("sdhasdhg" + url.getContent());
        } catch (Exception e){
            System.err.println("Try again");
            GetContent.main(new String[]{""});
        }
    }
}

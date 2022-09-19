import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args){
        System.out.println("Functioning");

        try {
            String contents = new String(Files.readAllBytes(Paths.get("res/demo.json")));
            Gson gson = new Gson();
        } catch(IOException ioe){
            ioe.printStackTrace();
        }

    }
}

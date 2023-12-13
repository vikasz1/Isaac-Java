import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputLesson {
    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);

        // float a = scanner.nextFloat();
        // System.out.println("i got "+a);
        

        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(bReader.readLine()) ;
            System.out.println(a);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

    }
}

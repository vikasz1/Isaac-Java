import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main(String args[]){
        // Date and Time
        LocalDateTime objDate = LocalDateTime.now();
        DateTimeFormatter isaac = DateTimeFormatter.ofPattern("HH:mm");

        String result = isaac.format(objDate);
        System.out.println(result);
    }
}
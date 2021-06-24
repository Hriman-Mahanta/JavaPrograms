//33. Program to display current date and time.
import java.time.LocalDateTime;
public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime current=LocalDateTime.now();
        System.out.println("Current Date and Time is: "+current);
    }
}

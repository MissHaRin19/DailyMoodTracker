import java.rmi.Naming;
import java.util.Scanner;

public class MoodClient {
    public static void main(String[] args) {
        try {
            MoodService service = (MoodService) Naming.lookup("rmi://localhost/MoodService");
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your mood: ");
            String mood = sc.nextLine();

            String response = service.recordMood(name, mood);
            System.out.println(response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


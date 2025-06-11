import java.rmi.Naming;

public class MoodServer {
    public static void main(String[] args) {
        try {
            Naming.rebind("MoodService", new MoodServiceImpl());
            System.out.println("Mood Server is ready.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MoodService extends Remote {
    String recordMood(String name, String mood) throws RemoteException;
}


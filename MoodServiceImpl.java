import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class MoodServiceImpl extends UnicastRemoteObject implements MoodService {
    MoodDAO dao = new MoodDAO();

    protected MoodServiceImpl() throws RemoteException {
        super();
    }

    public String recordMood(String name, String mood) throws RemoteException {
        boolean success = dao.saveMood(name, mood);
        return success ? "Mood recorded successfully!" : "Failed to record mood.";
    }
}


package DIP;

public class PostgressDB implements Database{
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }
}

package DIP;

public class MySqlDb implements Database{

    @Override
    public void connect() {
        System.out.println("Connected to MySqlDb");
    }
}

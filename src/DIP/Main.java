package DIP;

public class Main {
    public static void main(String[] args) {
        App app = new App(new MySqlDb());
        app.getConnection();
        App app2 = new App(new PostgressDB());
        app2.getConnection();
    }
}

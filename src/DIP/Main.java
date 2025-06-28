package DIP;

//Bad: Class A directly creates and uses Class B.
//Good: Class A depends on an interface, and Class B implements it.
//This decouples components and makes code flexible and testable.

public class Main {
    public static void main(String[] args) {
        App app = new App(new MySqlDb());
        app.getConnection();
        App app2 = new App(new PostgressDB());
        app2.getConnection();
    }
}

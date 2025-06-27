package DIP;

public class App {
    Database database;
    App(Database database){
        this.database = database;
    }

    public void getConnection(){
        this.database.connect();
    }
}

package DIP;

public class AppVio {
    private MySQLDBVio database;
    AppVio(){
        this.database=new MySQLDBVio();
    }
    public void performTask() {
        database.connect();
    }

//    ❌ What’s wrong?
//    Application is tightly coupled to MySQLDatabase.
//    What if we want to switch to PostgreSQL or MongoDB?
}

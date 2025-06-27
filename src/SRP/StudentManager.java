package SRP;

public class StudentManager {

    public void addSutudent(String name,String email){
        System.out.println("Student "+name+" has beed added.");
        saveToDatabase(name,email);
    }

    public void saveToDatabase(String name,String email){
        System.out.println("Saving student "+name+" to database");
        sendingEmailToStudent(name,email);
    }

    public void sendingEmailToStudent(String name,String email){
        System.out.println("Sending email to "+email);
    }


}

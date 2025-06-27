package SRP;

public class SingletonStudManager {
    private StudentRepository studentRepository;
    private EmailHandler emailHandler;
    SingletonStudManager(StudentRepository studentRepository,EmailHandler emailHandler){
        this.emailHandler = emailHandler;
        this.studentRepository = studentRepository;
    }

    public void addStudent(String name,String email){
        System.out.println("Entry of an student "+name+" has been added");
        this.studentRepository.saveStudent(name);
        this.emailHandler.sendMail(email);
    }
}

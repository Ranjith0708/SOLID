package SRP;

public class SinglyResponsePractise {
    public static void main(String[] args) {

        //Bad practise for singleton
        StudentManager studentManager = new StudentManager();
        studentManager.addSutudent("Ranjith","ranjithkv@gmail.com");

        //Good practise of singleton
        SingletonStudManager singletonStudManager = new SingletonStudManager(new StudentRepository(),new EmailHandler());
        singletonStudManager.addStudent("Ranjith","ranjithkv@gmail.com");

    }
}

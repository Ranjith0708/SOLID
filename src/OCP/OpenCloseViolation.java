package OCP;

public class OpenCloseViolation {
    public void generateReport(String type){
        if(type.equals("PDF")){
            System.out.println("Generating PDF report...");
        } else if (type.equals("EXCEL")) {
            System.out.println("Generating EXCEL report...");
        }
    }
}

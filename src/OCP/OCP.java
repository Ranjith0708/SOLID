package OCP;


/*
Definition: A class should be open for extension, but closed for modification.
This means:
You should be able to add new behavior without changing existing code.
This is typically achieved through abstraction (interfaces, abstract classes, etc.).
*/
public class OCP {
    public static void main(String[] args) {
        OpenCloseViolation openCloseViolation = new OpenCloseViolation();
        openCloseViolation.generateReport("EXCEL");
        openCloseViolation.generateReport("PDF");

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(new ExcelGenerator());
        reportGenerator.generateReport(new PdfGenerator());
    }
}

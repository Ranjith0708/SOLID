package OCP;

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

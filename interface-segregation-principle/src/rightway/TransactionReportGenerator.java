package rightway;

public class TransactionReportGenerator {
    
    private Reporting reporting;
    
    public TransactionReportGenerator (Reporting reporting) {
        this.reporting = reporting;
    }
    
    public void reportGenerator(){
        System.out.println (reporting.getName ()+" "+reporting.getProductBreakDown ());
    }
    
}

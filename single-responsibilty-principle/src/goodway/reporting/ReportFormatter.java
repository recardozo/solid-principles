package goodway.reporting;

public class ReportFormatter {
    
    String formattedOutput;
    
    public ReportFormatter (Object object, FormatType formatType) {
        switch (formatType) {
            case XML:
                formattedOutput = converObjectToXml (object);
                break;
            case CSV:
                formattedOutput = converObjectToCsv (object);
                break;
        }
        
    }
    
    private String converObjectToXml (Object object) {
        return "XML: <title>" + object.toString () + "</title>";
    }
    
    private String converObjectToCsv (Object object) {
        return "CSV: ,,,," + object.toString () + ",,,,";
    }
    
    public String getFormattedValue () {
        return formattedOutput;
    }
}

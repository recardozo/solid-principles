package wrongway;

import java.util.Date;

public class CustomerTransaction {
    
    // methods for reporting
    public String getName(){
    return "Renato";
    }
    
    public Date getDate(){
        return new Date ();
    }
    
    public String getProductBreakDown(){
        return "product";
    }
    
    //methods for accounts receivable
    public String prepareInvoice(){
        return "prepare invoice";
    }
    
    public String chargeCustomer(){
        return "charge customer";
    }
}

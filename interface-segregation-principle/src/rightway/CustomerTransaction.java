package rightway;


import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting,Reporting {
    
    private List<Product> products;
    private Customer customer;
    
    public CustomerTransaction (List<Product> products, rightway.Customer aCustomer) {
        this.products = products;
        customer = aCustomer;
    }
    
    @Override
    public void prepareInvoice () {
    
    }
    
    @Override
    public void chargeCustomer () {
    
    }
    
    @Override
    public String getName () {
        return customer.getName ();
    }
    
    @Override
    public Date getDate () {
        return null;
    }
    
    @Override
    public String getProductBreakDown () {
        return null;
    }
}

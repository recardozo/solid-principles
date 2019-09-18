package rightway;

public class AccountsReceivable {
    
    private Accounting accounting;
    
    public AccountsReceivable (Accounting accounting) {
        this.accounting = accounting;
    }
    
    public void postPayment(){
        accounting.chargeCustomer ();
    }
    
    public void sendInvoice(){
        accounting.prepareInvoice ();
    }
}

package wrongway;

public class AccountsReceivable {
    
    CustomerTransaction customerTransaction;
    
    public AccountsReceivable (CustomerTransaction customerTransaction) {
        this.customerTransaction = customerTransaction;
    }
    
    public void postPayment(){
        customerTransaction.chargeCustomer ();
    }
    
    public void sendInvoice(){
        customerTransaction.prepareInvoice ();
    }
}

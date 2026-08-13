// chain/ApproveTransaction.java
package chain;

public class ApproveTransaction extends TransactionHandler {
    @Override
    protected boolean process(Transaction tx) {
        System.out.println("Transação aprovada!");
        return true;
    }
}

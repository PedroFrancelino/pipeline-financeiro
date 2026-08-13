// chain/ValidateDailyLimit.java
package chain;

public class ValidateDailyLimit extends TransactionHandler {
    @Override
    protected boolean process(Transaction tx) {
        if (tx.amount <= tx.dailyLimit) {
            System.out.println("Limite diário validado.");
            return true;
        }
        System.out.println("Falha: limite diário excedido.");
        return false;
    }
}

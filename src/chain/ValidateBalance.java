package chain;

public class ValidateBalance extends TransactionHandler {
    @Override
    protected boolean process(Transaction tx) {
        if (tx.amount <= tx.balance) {
            System.out.println("Saldo suficiente validado.");
            return true;
        }
        System.out.println("Falha: saldo insuficiente.");
        return false;
    }


}


package chain;

public class CheckFraud extends TransactionHandler {
    @Override
    protected boolean process(Transaction tx) {
        if (!tx.fraudDetected) {
            System.out.println("Nenhuma fraude detectada.");
            return true;
        }
        System.out.println("Falha: fraude detectada.");
        return false;
    }
}

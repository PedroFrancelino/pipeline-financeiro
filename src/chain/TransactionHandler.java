
package chain;

public abstract class TransactionHandler {
    private TransactionHandler next;

    public TransactionHandler setNext(TransactionHandler next) {
        this.next = next;
        return next;
    }

    public void handle(Transaction tx) {
        if (process(tx) && next != null) {
            next.handle(tx);
        }
    }

    protected abstract boolean process(Transaction tx);
}

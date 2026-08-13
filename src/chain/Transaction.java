package chain;

public class Transaction {
   
    public double amount;
    public double balance;
    public double dailyLimit;
    public boolean fraudDetected;

    public Transaction(double amount, double balance, double dailyLimit, boolean fraudDetected) {
        this.amount = amount;
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.fraudDetected = fraudDetected;
    
}

}

package strategy;

public class CreditCardFee implements FeeStrategy {
    @Override
    public double calculateFee(double amount) {
        return amount * 0.05; // 5% taxa
    }
}

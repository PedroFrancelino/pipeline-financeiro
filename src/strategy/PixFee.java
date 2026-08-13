package strategy;

public class PixFee implements FeeStrategy {
    @Override
    public double calculateFee(double amount) {
        return amount * 0.01; // 1% taxa
    }
}

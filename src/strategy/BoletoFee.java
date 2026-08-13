package strategy;

public class BoletoFee implements FeeStrategy {
    @Override
    public double calculateFee(double amount) {
        return 2.50; // taxa fixa
    }
}

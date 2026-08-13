package main;

import chain.*;
import strategy.*;
import factory.*;

public class Main {
    public static void main(String[] args) {
        // Chain of Responsibility
        TransactionHandler chain = new ValidateBalance();
        chain.setNext(new ValidateDailyLimit())
             .setNext(new CheckFraud())
             .setNext(new ApproveTransaction());

        Transaction tx = new Transaction(100, 500, 200, false);
        chain.handle(tx);

        // Strategy
        FeeStrategy feeStrategy = new CreditCardFee();
        double fee = feeStrategy.calculateFee(tx.amount);
        System.out.println("Taxa calculada: R$ " + fee);

        // Factory Method
        TransactionProcessor processor = ProcessorFactory.getProcessor("json");
        processor.process("{\"amount\":100}");
    }
}

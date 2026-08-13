package factory;

public class ApiProcessor implements TransactionProcessor {
    @Override
    public void process(String data) {
        System.out.println("Processando transação via API: " + data);
    }
}

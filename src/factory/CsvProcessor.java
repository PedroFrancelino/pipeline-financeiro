package factory;

public class CsvProcessor implements TransactionProcessor {
    @Override
    public void process(String data) {
        System.out.println("Processando transação via CSV: " + data);
    }
}

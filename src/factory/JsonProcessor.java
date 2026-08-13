
package factory;

public class JsonProcessor implements TransactionProcessor {
    @Override
    public void process(String data) {
        System.out.println("Processando transação via JSON: " + data);
    }
}


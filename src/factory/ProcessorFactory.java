package factory;

public class ProcessorFactory {
    public static TransactionProcessor getProcessor(String type) {
        switch (type.toLowerCase()) {
            case "csv": return new CsvProcessor();
            case "json": return new JsonProcessor();
            case "api": return new ApiProcessor();
            default: throw new IllegalArgumentException("Tipo desconhecido: " + type);
        }
    }
}

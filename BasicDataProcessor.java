public class BasicDataProcessor implements DataProcessor {
    @Override
    public void process(String data) {
        System.out.println("Processing data: " + data);
    }
}

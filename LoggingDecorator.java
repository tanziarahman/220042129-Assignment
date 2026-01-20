public class LoggingDecorator extends DataProcessorDecorator {
    public LoggingDecorator(DataProcessor wrappee) {
        super(wrappee);
    }

    @Override
    public void process(String data) {
        System.out.println("Logging: " + data);
        super.process(data);
    }
}

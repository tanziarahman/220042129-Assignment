public abstract class DataProcessorDecorator implements DataProcessor {
    protected DataProcessor wrappee;

    public DataProcessorDecorator(DataProcessor wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void process(String data) {
        wrappee.process(data);
    }
}

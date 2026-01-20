public class EncryptionDecorator extends DataProcessorDecorator {
    public EncryptionDecorator(DataProcessor wrappee) {
        super(wrappee);
    }

    @Override
    public void process(String data) {
        System.out.println("Encrypting: " + data);
        super.process(data);
    }
}

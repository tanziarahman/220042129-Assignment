public class SecurePipeline extends DataProcessingPipeline {

    @Override
    protected void read(String fileName) {
        System.out.println("Reading secure file: " + fileName);
    }

    @Override
    protected void transform() {
        System.out.println("Decrypting & transforming secure data...");
    }

    @Override
    protected void write() {
        System.out.println("Writing encrypted results to secure storage");
    }
}

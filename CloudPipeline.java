public class CloudPipeline extends DataProcessingPipeline {

    @Override
    protected void read(String fileName) {
        System.out.println("Reading file from cloud: " + fileName);
    }

    @Override
    protected void transform() {
        System.out.println("Transforming cloud data...");
    }

    @Override
    protected void write() {
        System.out.println("Writing processed data to cloud storage");
    }
}

public class Main {
    public static void main(String[] args) {

        // === Compression Strategy Example ===
        CompressionContext compressionContext = new CompressionContext();
        CompressionStrategyFactory.setCompressionStrategy(compressionContext, "zip");
        compressionContext.compress("AssignmentData");

        CompressionStrategyFactory.setCompressionStrategy(compressionContext, "gzip");
        compressionContext.compress("StudentRecords");

        // === File Reader Strategy Example ===
        FileReaderContext fileReaderContext = new FileReaderContext();
        FileReaderFactory.setFileReader(fileReaderContext, "csv");
        fileReaderContext.readFile("students.csv");

        FileReaderFactory.setFileReader(fileReaderContext, "json");
        fileReaderContext.readFile("data.json");

        // === Decorator Pattern Example ===
        DataProcessor processor = new LoggingDecorator(
                                    new EncryptionDecorator(
                                        new BasicDataProcessor()));
        processor.process("Grade Records");

        // === Template Method / Pipeline Pattern Example ===
        DataProcessingPipeline pipeline = new SecurePipeline();
        pipeline.run("secure-data.json");

        DataProcessingPipeline cloudPipeline = new CloudPipeline();
        cloudPipeline.run("cloud-data.csv");
    }
}

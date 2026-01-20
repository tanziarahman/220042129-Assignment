public class Main {
    public static void main(String[] args) {

        CompressionContext compressionContext = new CompressionContext();

        CompressionStrategyFactory.setCompressionStrategy(compressionContext, "zip");
        compressionContext.compress("AssignmentData");

        CompressionStrategyFactory.setCompressionStrategy(compressionContext, "gzip");
        compressionContext.compress("StudentRecords");

        System.out.println("--------------");

        FileReader csvReader = FileReaderFactory.getFileReader("csv");
        csvReader.read("students.csv");

        FileReader jsonReader = FileReaderFactory.getFileReader("json");
        jsonReader.read("data.json");

        FileReader xmlReader = FileReaderFactory.getFileReader("xml");
        xmlReader.read("config.xml");

        System.out.println("--------------");

        DataProcessor processor = new LoggingDecorator(
                                    new EncryptionDecorator(
                                        new BasicDataProcessor()));
        processor.process("Grade Records");

        System.out.println("--------------");

        DataProcessingPipeline securePipeline = new SecurePipeline();
        securePipeline.run("secure-data.json");

        DataProcessingPipeline cloudPipeline = new CloudPipeline();
        cloudPipeline.run("cloud-data.csv");
    }
}

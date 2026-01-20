public class CompressionStrategyFactory {

    public static void setCompressionStrategy(CompressionContext context, String type) {
        if (type.equalsIgnoreCase("zip")) {
            context.setCompressionStrategy(new ZipCompression());
        } else if (type.equalsIgnoreCase("gzip")) {
            context.setCompressionStrategy(new GZipCompression());
        } else {
            throw new IllegalArgumentException("Unknown compression type: " + type);
        }
    }
}

public class CompressionContext {

    private CompressionStrategy strategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compress(String data) {
        if (strategy == null) {
            throw new IllegalStateException("Compression strategy not set!");
        }
        strategy.compress(data);
    }
}

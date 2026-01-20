public class GZipCompression implements CompressionStrategy {
    @Override
    public void compress(String data) {
        System.out.println("Compressing using GZIP: " + data);
    }
}

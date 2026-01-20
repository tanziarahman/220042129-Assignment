public class ZipCompression implements CompressionStrategy {
    @Override
    public void compress(String data) {
        System.out.println("Compressing using ZIP: " + data);
    }
}

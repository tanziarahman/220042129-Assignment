public abstract class DataProcessingPipeline {

    public final void run(String fileName) {
        read(fileName);
        transform();
        write();
    }

    protected abstract void read(String fileName);
    protected abstract void transform();
    protected abstract void write();
}

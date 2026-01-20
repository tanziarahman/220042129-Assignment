public class FileReaderFactory {
    public static FileReader getFileReader(String type) {
        switch (type.toLowerCase()) {
            case "csv": 
            return new CsvFileReader();
            case "json": 
            return new JsonFileReader();
            case "xml": 
            return new XmlFileReader();
            default: return null;
        }
    }
}

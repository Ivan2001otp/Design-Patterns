package reader;

public class CsvReader implements BaseParser{
    private final String filePath;

    public CsvReader(String path) {
        this.filePath =  path;
    }

    @Override
    public void parse() {
        System.out.println("Parsing file to Csv "+this.filePath);
    }
}

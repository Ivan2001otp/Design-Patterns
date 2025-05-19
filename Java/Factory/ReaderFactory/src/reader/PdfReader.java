package reader;

public class PdfReader implements BaseParser{
    private final String filePath;

    public PdfReader(String path) {
        this.filePath =  path;
    }

    @Override
    public void parse() {
        System.out.println("Parsing file to PDF "+this.filePath);
    }
}

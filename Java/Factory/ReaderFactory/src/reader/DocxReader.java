package reader;

public class DocxReader implements BaseParser{
    private final String filePath;

    public DocxReader(String path) {
        this.filePath =  path;
    }

    @Override
    public void parse() {
        System.out.println("Parsing file to Docx "+this.filePath);
    }
}

import factory.FileType;
import factory.ReaderFactory;
import reader.BaseParser;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        String type = "pdf";
        String filePath = "./files/abc.txt";

        BaseParser reader =  ReaderFactory.getReader(filePath, FileType.PDF);
        BaseParser csvReader =  ReaderFactory.getReader(filePath, FileType.CSV);
        BaseParser docxReader =  ReaderFactory.getReader(filePath, FileType.DOCX);
        reader.parse();

    }
}
package factory;

import reader.BaseParser;
import reader.CsvReader;
import reader.DocxReader;
import reader.PdfReader;

public class ReaderFactory {

    public static BaseParser getReader(String filePath, FileType type) {
        return switch(type) {
            case PDF ->  new PdfReader(filePath);
            case CSV -> new CsvReader(filePath);
            case DOCX -> new DocxReader(filePath);
        };
    }
}

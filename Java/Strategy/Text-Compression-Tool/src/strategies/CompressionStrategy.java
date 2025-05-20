package strategies;

import java.io.File;
import java.io.IOException;

public interface CompressionStrategy {
    void compress(File inputFile, File outputFile) throws IOException;
    void decompress(File inputFile, File outputFile) throws IOException;
}

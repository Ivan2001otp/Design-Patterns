package strategies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NoCompression implements CompressionStrategy {

    @Override
    public void compress(File inputFile, File outputFile) throws IOException {
        copy(inputFile, outputFile);
        System.out.println("No compression applied (Copied directly)");
    }

    @Override
    public void decompress(File inputFile, File outputFile) throws IOException {
        copy(inputFile, outputFile);
        System.out.println("No compression applied (Copied directly)");
    }

    private void copy(File inputFile, File outputFile) {
        try  (
                FileInputStream fis = new FileInputStream(inputFile);
                FileOutputStream fos = new FileOutputStream(outputFile);
        ){
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package strategies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZipCompression implements CompressionStrategy {
    @Override
    public void compress(File inputFile, File outputFile) throws IOException {
        try(
                FileInputStream fileInputStream = new FileInputStream(inputFile);
                FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
                GZIPOutputStream gzipOutputStream = new GZIPOutputStream(fileOutputStream);

        ){
            System.out.println("Started to compress file from Gzip Strategy.");
            byte[] buffer = new byte[1024];
            int length;
            while((length = fileInputStream.read(buffer)) > 0) {
                gzipOutputStream.write(buffer, 0, length);
            }
            System.out.println("Successfully compressed the file ... ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void decompress(File inputFile, File outputFile) throws IOException {
        try (
                FileInputStream fis = new FileInputStream(inputFile);
                GZIPInputStream gis = new GZIPInputStream(fis);
                FileOutputStream fos = new FileOutputStream(outputFile);
        ) {
            System.out.println("Started to decompress file from Gzip Strategy.");
            byte[] buffer = new byte[1024];
            int length;

            while ((length = gis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("Successfully compressed the file ... ");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}

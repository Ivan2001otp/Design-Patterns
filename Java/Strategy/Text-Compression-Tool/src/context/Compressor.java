package context;

import strategies.CompressionStrategy;

import java.io.File;
import java.io.IOException;

public class Compressor {
    private CompressionStrategy compressionStrategy;

    public void setCompressionStrategy(CompressionStrategy strategy) {
        this.compressionStrategy = strategy;
    }

    public void compress(String inputPath, String outputPath) throws IOException {
        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);

        if (compressionStrategy != null) {
            compressionStrategy.compress(inputFile, outputFile);
            showStats(inputFile, outputFile);
        }

        System.out.println("Compression not possible . Internal server error !");
    }

    public void decompress(String inputPath, String outputPath) throws IOException {

        File inputFile = new File(inputPath);
        File outputFile = new File(outputPath);

        if (compressionStrategy != null) {
            compressionStrategy.compress(inputFile, outputFile);
        }

        System.out.println("Decompression not possible. Internal server error !");
    }

    private void showStats(File inputFile, File outputFile) {
        long originalSize = inputFile.length();
        long compressedSize = outputFile.length();

        double ratio = (double) compressedSize/originalSize;

        System.out.println("== Compression Stats ==");
        System.out.printf("Original size: %.2f KB\n", kb(originalSize));
        System.out.printf("Compressed size: %.2f KB\n", kb(compressedSize));
        System.out.printf("Compression ratio: %.2f%%\n", ratio * 100);
        System.out.printf("Space saved: %.2f%%\n", (1 - ratio) * 100);
    }

    private double kb(long bytes) {
        return bytes/1024.0;
    }
}

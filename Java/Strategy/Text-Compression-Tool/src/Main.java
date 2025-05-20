import context.CompressType;
import context.Compressor;
import strategies.GZipCompression;
import strategies.NoCompression;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CompressType strategy = null;

        System.out.println("Hi welcome Todd-Text-Compressor !");
        System.out.println("Choose your strategy : gzip/none");
        System.out.println("1. Gzip");
        System.out.println("2. No Compression");
        System.out.println("3. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                strategy = CompressType.GZIP;
            }
            case 2 -> {
                strategy = CompressType.NO_COMPRESSION;
            }
            case 3 -> {
                System.exit(0);
            }
        }


        System.out.println("Choose your action ");
        System.out.println("1. Compress");
        System.out.println("2. Decompress");
        int action = sc.nextInt();
        String Action = action == 1 ? "compress" : "decompress";

        System.out.println("Input file path pls ?");
        String inputFile = sc.nextLine();

        System.out.println("Output file path pls ?");
        String outputFile = sc.nextLine();

        try {
            Compressor compressor = null;

            switch (Objects.requireNonNull(strategy)) {
                case GZIP -> {
                    compressor = new Compressor();
                    compressor.setCompressionStrategy(new GZipCompression());
                }

                case NO_COMPRESSION -> {
                    compressor = new Compressor();
                    compressor.setCompressionStrategy(new NoCompression());
                }

            }

            if (Action.equalsIgnoreCase("compress")) {
                compressor.compress(inputFile, outputFile);
            } else if (Action.equalsIgnoreCase("decompress")) {
                compressor.decompress(inputFile, outputFile);
            }
        } catch (Exception e) {

        } finally {
            sc.close();
        }
        System.out.println();
    }
}
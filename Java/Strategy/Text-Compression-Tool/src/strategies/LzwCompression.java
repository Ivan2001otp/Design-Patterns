package strategies;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LzwCompression implements CompressionStrategy {
    @Override
    public void compress(File inputFile, File outputFile) throws IOException {
        System.out.println("Started using LZW compression ");
        String input = new String(Files.readAllBytes(inputFile.toPath()));

        Map<String, Integer> dict = new HashMap<>();
        int dictSize = 256;

        // Key is ASCII
        for (int i=0; i<256; i++) {
            dict.put("" + (char)i, i);
        }

        String current = "";

        List<Integer> result = new ArrayList<>();

        for(char ch: input.toCharArray()) {
            String next = current + ch;

            if (dict.containsKey(next)) {
                current = next;
            } else {
                result.add(dict.get(current));
                dict.put(next, dictSize++);
                current = "" + ch;
            }
        }

        if (!current.isEmpty()) {
            result.add(dict.get(current));
        }

        try (
                DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile))
            ) {
                for (int code : result) {
                    dos.write(code);
                }
        } catch (IOException e) {
            System.out.println("Failed to compress from LZW compression technique !");
            e.printStackTrace();
        }

        System.out.println("LZW Compression complete");
    }


    @Override
    public void decompress(File inputFile, File outputFile) throws IOException {
        List<Integer> compressed = new ArrayList<>();
        try(
            DataInputStream dis = new DataInputStream(new FileInputStream(inputFile))
        ) {
            while (dis.available() > 0) {
                    compressed.add(dis.read());
            }
        } catch (IOException e) {
            System.out.println("Failed to decompress from LZW compression technique !");
            e.printStackTrace();
        }


        
    }
}

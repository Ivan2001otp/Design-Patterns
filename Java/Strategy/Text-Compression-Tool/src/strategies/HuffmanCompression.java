package strategies;

import java.io.*;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanCompression implements CompressionStrategy {
    private Map<Character, String> huffmanCodes = new HashMap<>();

    private Node buildTree(String input) {
        Map<Character, Integer>freq = new HashMap<>();

        for(char c : input.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue(), null, null));
        }

        while(pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();

            assert left!= null;
            assert right!=null;

            pq.add(new Node('\0', left.freq + right.freq, left, right));
        }

        return pq.poll();
    }

    private void buildCodes(Node node, String code) {
        if (node == null) return;

        if (node.isLeaf()) {
            huffmanCodes.put(node.ch, code);
        }

        buildCodes(node.left, code + "0");
        buildCodes(node.right, code + "1");
    }

    private static class Node implements Comparable<Node> {

        char ch;
        int freq;
        Node left, right;

        Node(char ch, int frequency, Node left, Node right) {
            this.ch = ch;
            this.freq = frequency;
            this.left = left;
            this.right = right;
        }

        boolean  isLeaf() {
            return left==null && right == null;
        }

        @Override
        public int compareTo(Node o) {
            return this.freq - o.freq;
        }
    }

    @Override
    public void compress(File inputFile, File outputFile) throws IOException {
        String input = new String(Files.readAllBytes(inputFile.toPath()));
        Node root = buildTree(input);

        buildCodes(root, "");

        StringBuilder encoded = new StringBuilder();
        for (char c : input.toCharArray()) {
            encoded.append(huffmanCodes.get(c));
        }

        try (
                ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(outputFile));
            ) {
            os.writeObject(huffmanCodes);
            os.writeObject(encoded.toString());
        }

        System.out.println("Huffman Compression complete");
    }

    @Override
    public void decompress(File inputFile, File outputFile) throws IOException {
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(inputFile));
                ) {
            Map<String, Character> reverseMap = new HashMap<>();
            Map<Character, String> savedCodes = (Map<Character, String>) ois.readObject();
            String encoded = (String) ois.readObject();

            for (Map.Entry<Character, String> entry : savedCodes.entrySet()) {
                reverseMap.put(entry.getValue(), entry.getKey());
            }

            StringBuilder decoded = new StringBuilder();
            StringBuilder current = new StringBuilder();

            for (char bit : encoded.toCharArray()) {
                current.append(bit);

                if (reverseMap.containsKey(current.toString())) {
                    decoded.append(reverseMap.get(current.toString()));
                    current.setLength(0);
                }
            }

            Files.write(outputFile.toPath(), decoded.toString().getBytes());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        System.out.println("Huffman Decompression complete");
    }
}

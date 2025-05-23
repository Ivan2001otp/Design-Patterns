package decorators;

import interfaces.DataSource;

import java.io.*;

public class FileDataSource implements DataSource {

    private final String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeDate(String data) {
        File file = new File(name);
        try (
                OutputStream outputStream = new FileOutputStream(file)
            ) {

            outputStream.write(data.getBytes(), 0, data.length());

        } catch (IOException e) {
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;

        File file = new File(name);
        try(FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            e.getMessage();
        }

        return new String(buffer);
    }
}

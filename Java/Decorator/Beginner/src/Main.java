import decorators.CompressionDecorator;
import decorators.DataSourceDecorator;
import decorators.EncryptionDecorator;
import decorators.FileDataSource;
import interfaces.DataSource;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/Output.txt")
                )
        );

        encoded.writeDate(salaryRecords);
        DataSource plain = new FileDataSource("out/Output.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
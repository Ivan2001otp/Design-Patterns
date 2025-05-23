package decorators;

import interfaces.DataSource;

import java.util.Base64;

public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    public void writeData(String data) {
            super.writeDate(encode(data));
    }

    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();

        for(int i=0; i < result.length; i++) {
            result[i] += (byte)i;
        }

        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i=0;i < result.length;i++) {
            result[i] -= (byte)i;
        }

        return new String(result);
    }
}

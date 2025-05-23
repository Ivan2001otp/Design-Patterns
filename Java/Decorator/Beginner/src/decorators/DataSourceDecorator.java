package decorators;

import interfaces.DataSource;

public abstract class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeDate(String data) {
        wrappee.writeDate(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }

}

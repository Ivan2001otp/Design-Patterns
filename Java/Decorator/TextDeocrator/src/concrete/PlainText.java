package concrete;

import components.TextFormat;

public class PlainText implements TextFormat {
    private final String text;

    public PlainText(String text) {
        this.text = text;
    }


    @Override
    public String write() {
        System.out.println("Writing data : " + text);
        return text;
    }
}

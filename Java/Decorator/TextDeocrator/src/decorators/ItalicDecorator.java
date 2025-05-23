package decorators;

import components.TextFormat;
import org.w3c.dom.Text;

public class ItalicDecorator extends BaseTextDecorator {

    public ItalicDecorator(TextFormat format) {
        super(format);
    }

    @Override
    public String write() {
        return "<i>" + textFormatComponent.write() + "</i>";
    }
}

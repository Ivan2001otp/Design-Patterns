package decorators;

import components.TextFormat;
import concrete.PlainText;
import org.w3c.dom.Text;

public abstract class BaseTextDecorator implements TextFormat {
    protected TextFormat textFormatComponent;

    public BaseTextDecorator(TextFormat textFormat) {
        this.textFormatComponent = textFormat;
    }

    @Override
    public abstract String write();
}

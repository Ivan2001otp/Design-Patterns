package decorators;

import components.TextFormat;

public class UnderlineDecorator extends BaseTextDecorator {
    public UnderlineDecorator(TextFormat component) {
        super(component);
    }
    @Override
    public String write() {
        return "<u>" + textFormatComponent.write() + "</u>";
    }
}

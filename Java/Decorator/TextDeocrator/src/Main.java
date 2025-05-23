import components.TextFormat;
import concrete.PlainText;
import decorators.ItalicDecorator;
import decorators.UnderlineDecorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        TextFormat component = new UnderlineDecorator(
                new PlainText("This is underlined text ")
        );
        TextFormat component1 = new ItalicDecorator(
                new UnderlineDecorator(
                        new PlainText("This is underlined & italic text !")
                )
        );

        TextFormat component2 = new PlainText("this is plain text");
        System.out.println(component1.write());
        System.out.println(component.write());
        System.out.println(component2.write());
    }
}
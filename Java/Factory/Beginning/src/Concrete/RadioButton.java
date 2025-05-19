package Concrete;
import Base.ButtonI;

public class RadioButton implements ButtonI {

    @Override
    public void render() {
        System.out.println("Rendering Radio Button !");
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Radio Button !");
    }
}

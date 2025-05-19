package Concrete;

import Base.ButtonI;

public class ElevatedButton implements  ButtonI {
    @Override
    public void render() {
        System.out.println("Rendering Elevated Button !");
    }

    @Override
    public void onClick() {
        System.out.println("Clicked Elevated Button.");
    }
}

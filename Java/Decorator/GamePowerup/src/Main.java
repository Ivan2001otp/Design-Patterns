import characters.BaseCharacter;
import decorators.InvisibilityPowerDecorator;
import decorators.ShieldPowerDecorator;
import decorators.SpeedPowerDecorator;
import interfaces.GameCharacter;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        GameCharacter gameCharacter = new SpeedPowerDecorator(new BaseCharacter());
        System.out.println(gameCharacter.getDescription());

        GameCharacter gameCharacter1 = new ShieldPowerDecorator(
                new InvisibilityPowerDecorator(
                        new SpeedPowerDecorator(
                                new BaseCharacter()
                        )
                )
        );
        System.out.println(gameCharacter1.getDescription());
    }
}
package decorators;

import interfaces.GameCharacter;

public class ShieldPowerDecorator extends BaseDecorator{

    public ShieldPowerDecorator(GameCharacter character) {
        super(character);
    }

    @Override
    public String getDescription(){
        return gameCharacter.getDescription() + ", Shield";
    }

    @Override
    public int getPowerLevel() {
        return gameCharacter.getPowerLevel() + 20;
    }

}

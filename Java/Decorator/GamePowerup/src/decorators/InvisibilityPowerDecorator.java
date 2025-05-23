package decorators;

import interfaces.GameCharacter;

public class InvisibilityPowerDecorator extends BaseDecorator {

    public InvisibilityPowerDecorator(GameCharacter character) {
        super(character);
    }

    @Override
    public String getDescription(){
        return gameCharacter.getDescription() + ", Invisibility";
    }

    @Override
    public int getPowerLevel() {
        return gameCharacter.getPowerLevel() + 40;
    }
}

package decorators;

import interfaces.GameCharacter;

public class SpeedPowerDecorator extends BaseDecorator {

    public SpeedPowerDecorator(GameCharacter character) {
        super(character);
    }

    @Override
    public String getDescription(){
        return gameCharacter.getDescription() + ", Speed";
    }

    @Override
    public int getPowerLevel() {
        return gameCharacter.getPowerLevel() + 45;
    }
}


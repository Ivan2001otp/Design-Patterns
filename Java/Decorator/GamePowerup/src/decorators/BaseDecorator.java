package decorators;

import interfaces.GameCharacter;

public abstract class BaseDecorator implements GameCharacter {
    protected GameCharacter gameCharacter;

    public BaseDecorator(GameCharacter character) {
        this.gameCharacter = character;
    }

    @Override
    public String getDescription(){
        return gameCharacter.getDescription();
    }

    @Override
    public int getPowerLevel() {
        return gameCharacter.getPowerLevel();
    }

}

package characters;

import interfaces.GameCharacter;

public class BaseCharacter implements GameCharacter {
    @Override
    public String getDescription() {
        return "Game Description : Base stats";
    }

    @Override
    public int getPowerLevel() {
        return 10;
    }
}

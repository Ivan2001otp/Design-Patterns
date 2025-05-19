package gun;

public class Riflegun implements GunHelper
{
    @Override
    public void assemble() {
        System.out.println("Rifle gun Assembling");

    }

    @Override
    public void fire() {
        System.out.println("Rifle gun firing");

    }

    @Override
    public void reload() {
        System.out.println("Rifle gun reloading");

    }

    @Override
    public void dismantle() {
        System.out.println("Rifle gun dismantling");

    }
}

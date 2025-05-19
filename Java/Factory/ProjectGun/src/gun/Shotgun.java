package gun;

public class Shotgun implements  GunHelper{
    @Override
    public void assemble() {
        System.out.println("Shot gun Assembling");

    }

    @Override
    public void fire() {
        System.out.println("Shot gun firing");

    }

    @Override
    public void reload() {
        System.out.println("Shot gun reloading");

    }

    @Override
    public void dismantle() {
        System.out.println("Shot gun dismantling");

    }
}

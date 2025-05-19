package gun;

public class Pistolgun implements GunHelper{

    @Override
    public void assemble() {
        System.out.println("Pistol gun Assembling");

    }

    @Override
    public void fire() {
        System.out.println("Pistol gun Firing");

    }

    @Override
    public void reload() {
        System.out.println("Pistol gun reloading");

    }

    @Override
    public void dismantle() {
        System.out.println("Pistol gun dismantling");

    }
}

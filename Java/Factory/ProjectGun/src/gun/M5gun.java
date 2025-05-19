package gun;

public class M5gun implements GunHelper{


    @Override
    public void assemble() {
        System.out.println("M5 gun Assembling");
    }

    @Override
    public void fire() {
        System.out.println("M5 gun firing");

    }

    @Override
    public void reload() {
        System.out.println("M5 gun reloading");

    }

    @Override
    public void dismantle() {
        System.out.println("M5 gun dismantling");

    }
}

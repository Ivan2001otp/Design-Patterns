import factory.BaseGunFactory;
import factory.GunType;
import gun.GunHelper;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        GunHelper pistol =  BaseGunFactory.getLoadedGun(GunType.PISTOL);

        GunHelper m5 = BaseGunFactory.getLoadedGun(GunType.M5GUN);


    }
}
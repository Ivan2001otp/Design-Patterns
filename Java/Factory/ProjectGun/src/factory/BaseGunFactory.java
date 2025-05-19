package factory;

import gun.*;

public  class BaseGunFactory  {
    public static GunHelper getLoadedGun(GunType type) {
       GunHelper gunHelper;

        switch(type) {
            case M5GUN -> {
                gunHelper = new M5gun();
                gunHelper.assemble();
                gunHelper.reload();
            }

            case PISTOL -> {
                gunHelper = new Pistolgun();
                gunHelper.assemble();
                gunHelper.reload();
            }

            case RIFLE -> {
                gunHelper = new Riflegun();
                gunHelper.assemble();
                gunHelper.reload();
            }

            case SHOTGUN -> {
                gunHelper = new Shotgun();
                gunHelper.assemble();
                gunHelper.reload();
            }

            default -> {
                System.out.println("By default !");
                gunHelper = new Pistolgun();
                gunHelper.assemble();
                gunHelper.reload();
            }

        };

        return gunHelper;
    }
}

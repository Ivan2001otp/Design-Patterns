package factory

import (
	"GunFactory/gun" 
	"fmt"
)

func GetGunFromFactory(gunType GunType) ( gun.IGun, error) {

	if gunType == Ak47 {
		return  gun.Ak47Provider(), nil;
	} else if gunType == Musket {
		return gun.MusketProvider(), nil;
	} 

	fmt.Println("Provided  guntype does not exists")

	return nil, fmt.Errorf("wrong gun type passed")
}
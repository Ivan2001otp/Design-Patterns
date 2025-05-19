package main

import (
	"GunFactory/factory"
	"fmt"
)

func main() {
	fmt.Println("Hi Immanuel back to Grind ?");

	ak47,_ := factory.GetGunFromFactory(factory.Ak47);
	fmt.Println(ak47.GetName() + " - ")
	fmt.Println(ak47.GetPower())

	musket,_ := factory.GetGunFromFactory(factory.Musket);
	fmt.Println(musket.GetName() + " - ")
	fmt.Println(musket.GetPower())
}
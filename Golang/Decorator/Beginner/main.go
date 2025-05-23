package main

import (
	"fmt"
	"Decorator-Beginner/decorators"
)

func main() {
	fmt.Println("hi");

	character := decorators.NewShield(
		decorators.NewVisibility(
			decorators.NewSpeedBoost(
				&decorators.BasicCharacter{},
			),
		),
	)

	character2 := decorators.NewVisibility(
		decorators.NewSpeedBoost(
			&decorators.BasicCharacter{},
		),
	)
	
	fmt.Println(character2.GetAbilities())
	fmt.Println(character.GetAbilities())
}
package subsystems

import (
	"fmt"
)

type TV struct {}

func (tv *TV) TurnOn() {
	fmt.Println("TV is on")
}

func (tv *TV) TurnOff() {
	fmt.Println("TV is off")
}
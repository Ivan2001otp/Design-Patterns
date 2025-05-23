package subsystems

import (
	"fmt"
)

type Lights struct{}

func (l *Lights) Dim() {
	fmt.Println("Lights dimmed")
}

func (l *Lights) TurnOff() {
	fmt.Println("Lights OFF")
}

func (l *Lights) TurnOn() {
	fmt.Println("Lights ON")
}
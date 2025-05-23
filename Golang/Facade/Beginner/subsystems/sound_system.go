package subsystems

import (
	"fmt"
)

type SoundSystem struct {}

func (s *SoundSystem) TurnOn() {
	fmt.Println("Turning on sound system")
}

func (s *SoundSystem) TurnOff() {
	fmt.Println("Turning of sound system")
}

func (s *SoundSystem) SetVolume(volume int32) {
	fmt.Printf("The volume set is %d\n", volume)
}
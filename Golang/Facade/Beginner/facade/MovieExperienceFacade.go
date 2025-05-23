package facade

import (
	"fmt"
	"Facade-Beginner/subsystems"
)

type MovieExperienceFacade struct {
	tv *subsystems.TV
	lightSystem *subsystems.Lights
	soundSystem *subsystems.SoundSystem
	streamer *subsystems.StreamingDevice
}

func NewMovieExpFacade() *MovieExperienceFacade {
	return &MovieExperienceFacade{
		tv : &subsystems.TV{},
		lightSystem : &subsystems.Lights{},
		soundSystem: &subsystems.SoundSystem{},
		streamer: &subsystems.StreamingDevice{},
	}
}


func (m *MovieExperienceFacade) StartMovie(movie string) {
	fmt.Println("\n🎬 Starting movie experience...")
	m.lightSystem.TurnOn()
	m.lightSystem.Dim()

	m.tv.TurnOn()
	m.soundSystem.TurnOn()
	m.soundSystem.SetVolume(10)
	m.streamer.Connect()
	m.streamer.Play(movie)
}

func (m *MovieExperienceFacade) EndMovie() {
	fmt.Println("\n🛑 Ending movie experience...")
	m.streamer.Disconnect()
	m.soundSystem.TurnOff()
	m.tv.TurnOff()
	m.lightSystem.TurnOn()
}
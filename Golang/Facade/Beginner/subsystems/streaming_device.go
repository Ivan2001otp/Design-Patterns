package subsystems

import (
	"fmt"
)

type StreamingDevice struct {}

func (s *StreamingDevice) Connect() {
	fmt.Println("Streaming device connected")
}

func (s *StreamingDevice) Disconnect() {
	fmt.Println("Streaming device disconnected")
}

func (s *StreamingDevice) Play(movie string) {
	fmt.Printf("Playing movie %s\n", movie)
}
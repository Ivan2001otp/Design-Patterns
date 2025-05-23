package main

import (
	"fmt"
	"Facade-Beginner/facade"
)

func main() {
	fmt.Println("Hi bro how's going !")
	facadeInstance := facade.NewMovieExpFacade();

	facadeInstance.StartMovie("Lord of Rings")
	facadeInstance.EndMovie();
}
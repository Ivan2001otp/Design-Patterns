package main

import "fmt"
import "Singleton/singleton" 

func main() {
	fmt.Println("Hi, I am running now !");


	for i:=0; i<=30; i++ {
		go singleton.GetInstance()
	}

	fmt.Scanln()
}
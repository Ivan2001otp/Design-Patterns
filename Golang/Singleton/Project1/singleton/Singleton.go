package singleton

import (
	"fmt"
	"sync"
)

var lock = &sync.Mutex{}
type single struct {}

var singleInstance *single;

func GetInstance() *single {
	if singleInstance == nil {
		lock.Lock()
		defer lock.Unlock();

		if singleInstance == nil {
			fmt.Println("Creating New Instance !")
			singleInstance = &single{}
		} else {
			fmt.Println("Instance reused !")
		}
	} else {
		fmt.Println("Single ton instance already created !")
	}

	return singleInstance;
}


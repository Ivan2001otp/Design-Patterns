package main

import (
	"Adapter-Beginner/logger_adapter" 
	"fmt"
)

func main() {
	fmt.Println("Hi This is adapter project !");
	zap := &loggeradapter.ZapLogger{}
	logger := loggeradapter.NewZapLoggerAdapter(zap)

	logger.LogInfo("App started !");
	logger.LogError("Something went wrong !");

}
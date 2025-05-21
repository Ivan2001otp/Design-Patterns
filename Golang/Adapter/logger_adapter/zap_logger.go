package loggeradapter

import "fmt"

type ZapLogger struct{}

func (z *ZapLogger) Info(message string) {
	fmt.Println("[ZAP][INFO] : ",message);
}

func (z *ZapLogger) Error(message string) {
	fmt.Println("[ZAP][ERROR] : ", message);
}
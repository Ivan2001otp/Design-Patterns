package loggeradapter

type Logger interface{ 
	LogInfo(message string);
	LogError(message string);
}
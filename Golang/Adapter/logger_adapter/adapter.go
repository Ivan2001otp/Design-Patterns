package loggeradapter

type ZapLoggerAdapter struct {
	zapLogger *ZapLogger
}

func NewZapLoggerAdapter (zapLogger *ZapLogger) *ZapLoggerAdapter {
	return &ZapLoggerAdapter{
		zapLogger: zapLogger,
	}
}


func (z *ZapLoggerAdapter) LogInfo (message string) {
		z.zapLogger.Info(message);
}

func (z *ZapLoggerAdapter) LogError (message string) {
	z.zapLogger.Error(message);
}
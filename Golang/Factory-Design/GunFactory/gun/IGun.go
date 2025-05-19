package gun

type IGun interface {
	SetName(name string)
	SetPower(power int)
	GetPower() int
	GetName() string

}
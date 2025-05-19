package gun

type Gun struct {
	name string
	power int
}

// getters ,setters

func (g* Gun) SetName(name string) {
	g.name = name;
}

func (g* Gun) SetPower(power int) {
	g.power = power;
}

func (g* Gun) GetPower() int {
	return g.power;
}

func (g* Gun) GetName() string {
	return g.name;
}
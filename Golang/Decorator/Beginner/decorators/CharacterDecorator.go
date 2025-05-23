package decorators

type CharacterDecorator struct {
	Wrapped Character
}

func (d* CharacterDecorator) GetAbilities() string {
	return d.Wrapped.GetAbilities();
}
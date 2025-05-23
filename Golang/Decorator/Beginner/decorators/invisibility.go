package decorators

type Invisibility struct{
	CharacterDecorator	// Base decorator
}

func NewVisibility(c Character) *Invisibility {
	return &Invisibility{
		CharacterDecorator{
			Wrapped: c,
		},
	}
}

func (i *Invisibility) GetAbilities() string {
	return i.Wrapped.GetAbilities() + ", Invisibility";
}


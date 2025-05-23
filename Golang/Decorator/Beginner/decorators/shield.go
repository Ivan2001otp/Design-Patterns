package decorators

type Shield struct {
	CharacterDecorator
}

func NewShield(c Character) *Shield {
	return &Shield{
		CharacterDecorator{
			Wrapped: c,
		},
	}
}

func (s* Shield) GetAbilities() string {
	return s.Wrapped.GetAbilities() + ", Shield"
}
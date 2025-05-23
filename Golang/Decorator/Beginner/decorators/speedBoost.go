package decorators

type SpeedBoost struct {
	CharacterDecorator
}

func NewSpeedBoost(c Character) *SpeedBoost {
	return &SpeedBoost{
		CharacterDecorator{Wrapped: c},
	}
}

func (s* SpeedBoost) GetAbilities() string {
	return s.Wrapped.GetAbilities() + ", Speed-Boost";
}
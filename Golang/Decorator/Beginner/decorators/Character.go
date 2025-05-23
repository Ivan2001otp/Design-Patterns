package decorators

type Character interface {
	GetAbilities() string
}

type BasicCharacter struct {}

func (b *BasicCharacter) GetAbilities() string {
	return "Basic Stats"
}
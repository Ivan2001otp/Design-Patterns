package gun

type Musket struct {
	Gun
}

func MusketProvider() IGun {
	return &Musket{
		Gun{
			name: "Musket",
			power: 12,
		},
	}
}

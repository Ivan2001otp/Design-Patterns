package gun

type Ak47 struct {
	Gun
}


func Ak47Provider() IGun {
	return &Ak47{
		Gun{
			name: "AK-47",
			power:10, 
		},
	}
}
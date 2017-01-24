package dataStructures;

public enum WojewodztwoEnum {

	ZACHPOM("Zachodniopomorskie", "ZACHPOM"), POM("Pomorskie", "POM"), WARMAZ("Warmiñsko-mazurskie", "WARMAZ"), LUBUS(
			"Lubuskie", "LUBUS"), WIELK("Wielkopolskie", "WIELK"), KUJPOM("Kujawsko-pomorskie",
					"KUJPOM"), MAZ("Mazowieckie", "MAZ"), PODL("Podlaskie", "PODL"), DOLN("Dolnoœl¹skie",
							"DOLN"), OPOL("Opolskie", "OPOL"), LODZ("£ódzkie", "LODZ"), SLAS("Œl¹skie",
									"SLAS"), SWIET("Œwiêtokrzyskie", "SWIET"), LUBEL("Lubelskie",
											"LUBEL"), MALOP("Ma³opolskie", "MALOP"), PODKA("Podkarpackie", "PODKA");

	private String code;
	private String name;

	private WojewodztwoEnum(String name, String code) {
		this.name = name;
		this.code = code;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}

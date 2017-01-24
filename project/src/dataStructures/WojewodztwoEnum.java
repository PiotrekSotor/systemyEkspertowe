package dataStructures;

public enum WojewodztwoEnum {

	ZACHPOM("Zachodniopomorskie", "ZACHPOM"), POM("Pomorskie", "POM"), WARMAZ("Warmi�sko-mazurskie", "WARMAZ"), LUBUS(
			"Lubuskie", "LUBUS"), WIELK("Wielkopolskie", "WIELK"), KUJPOM("Kujawsko-pomorskie",
					"KUJPOM"), MAZ("Mazowieckie", "MAZ"), PODL("Podlaskie", "PODL"), DOLN("Dolno�l�skie",
							"DOLN"), OPOL("Opolskie", "OPOL"), LODZ("��dzkie", "LODZ"), SLAS("�l�skie",
									"SLAS"), SWIET("�wi�tokrzyskie", "SWIET"), LUBEL("Lubelskie",
											"LUBEL"), MALOP("Ma�opolskie", "MALOP"), PODKA("Podkarpackie", "PODKA");

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

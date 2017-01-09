package dataStructures;

public enum AcademicThemeEnum {
	TECH("Techniczny"), MECH("Mechaniczny"), INF("Informatyczny"), ARCH("Architektoniczny"), ART("Artystyczny"), MAL(
			"Malarski"), MUZ("Muzyczny"), INSTR("Instrumentalny"), WOK("Wokalny"), MED("Medyczny"), STOM(
					"Stomatologiczny"), ECON("Ekonomiczny"), HUM("Humanistyczny"), LEANG(
							"Jêzykowy"), SCI("Œcis³y"), THEO("Teoretyczny"), UNKNOWN("undefined");

	private String name;

	private AcademicThemeEnum(String name) {
		this.name = name;
	}

	public AcademicThemeEnum getByCode(String code) {
		if (code != null) {
			switch (code) {
			case "TECH":
				return TECH;
			case "MECH":
				return MECH;
			case "INF":
				return INF;
			case "ARCH":
				return ARCH;
			case "ART":
				return ART;
			case "MAL":
				return MAL;
			case "MUZ":
				return MUZ;
			case "INSTR":
				return INSTR;
			case "WOK":
				return WOK;
			case "MED":
				return MED;
			case "STOM":
				return STOM;
			case "ECON":
				return ECON;
			case "HUM":
				return HUM;
			case "LEANG":
				return LEANG;
			case "SCI":
				return SCI;
			case "THEO":
				return THEO;

			default:
				return UNKNOWN;
			}
		} else
			return UNKNOWN;
	}
}

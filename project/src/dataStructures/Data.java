package dataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
	private static Data instance = null;
	private UniversityContainer universities = null;
	private WojewodzctwoContainer wojewodztwa = null;
	public static List<AcademicThemeEnum> themesSensitiveOnMath = new ArrayList<>(
			Arrays.asList(AcademicThemeEnum.ARCH, AcademicThemeEnum.ECON, AcademicThemeEnum.INF, AcademicThemeEnum.MECH,
					AcademicThemeEnum.SCI, AcademicThemeEnum.TECH, AcademicThemeEnum.THEO));

	public static List<AcademicThemeEnum> themesSensitiveOnPhysics = new ArrayList<>(
			Arrays.asList(AcademicThemeEnum.INF, AcademicThemeEnum.MECH, AcademicThemeEnum.SCI, AcademicThemeEnum.TECH,
					AcademicThemeEnum.THEO));
	public static List<AcademicThemeEnum> themesSensitiveOnPolish = new ArrayList<>(Arrays.asList(AcademicThemeEnum.HUM,
			AcademicThemeEnum.LEANG, AcademicThemeEnum.THEO, AcademicThemeEnum.MUZ));
	public static List<AcademicThemeEnum> themesSensitiveOnForeign = new ArrayList<>(
			Arrays.asList(AcademicThemeEnum.HUM, AcademicThemeEnum.LEANG, AcademicThemeEnum.WOK));
	public static List<AcademicThemeEnum> themesSensitiveOnBiology = new ArrayList<>(
			Arrays.asList(AcademicThemeEnum.MED, AcademicThemeEnum.STOM, AcademicThemeEnum.SCI));
	public static List<AcademicThemeEnum> themesSensitiveOnChemistry = new ArrayList<>(
			Arrays.asList(AcademicThemeEnum.MED, AcademicThemeEnum.STOM, AcademicThemeEnum.SCI));
	public static List<AcademicThemeEnum> themesSensitiveOnDraw = new ArrayList<>(
			Arrays.asList(AcademicThemeEnum.ARCH, AcademicThemeEnum.ART, AcademicThemeEnum.HUM, AcademicThemeEnum.MAL,
					AcademicThemeEnum.WF, AcademicThemeEnum.WOK));
	public static List<AcademicThemeEnum> themesSensitiveOnArt = new ArrayList<>(
			Arrays.asList(AcademicThemeEnum.ARCH, AcademicThemeEnum.ART, AcademicThemeEnum.HUM, AcademicThemeEnum.MAL,
					AcademicThemeEnum.WF, AcademicThemeEnum.MUZ, AcademicThemeEnum.WOK));

	private Data() {
		wojewodztwa = new WojewodzctwoContainer();
		universities = new UniversityContainer(wojewodztwa);

	}

	public static Data getInstance() {
		if (instance == null) {
			instance = new Data();
		}
		return instance;
	}

	public Wojewodzctwo getWojewodzctwoByCode(String code) {
		return wojewodztwa.getWojewodztwoByCode(code);
	}

	public List<University> getUniversities() {
		return universities.getList();
	}

}

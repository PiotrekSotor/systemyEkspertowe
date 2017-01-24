package dataStructures;

import java.util.List;

public class Data {
	private static Data instance = null;
	private UniversityContainer universities = null;
	private WojewodzctwoContainer wojewodztwa = null;

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

package dataStructures;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Set;

public class University {

	Path wojewodztwaFilePath = FileSystems.getDefault().getPath("./data", "uczelnie.txt");

	private String name;
	private Set<AcademicThemeEnum> themesMatching;
	private Wojewodzctwo wojewodzctwo;
	private String city;
	private Integer rating;
	private Ambition ambitious;

	public Ambition getAmbitious() {
		return ambitious;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
		ambitious = Ambition.LOW;
		if (rating < 40)
			ambitious = Ambition.MID;
		if (rating < 20)
			ambitious = Ambition.HIGH;

	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Wojewodzctwo getWojewodzctwo() {
		return wojewodzctwo;
	}

	public void setWojewodzctwo(Wojewodzctwo wojewodzctwo) {
		this.wojewodzctwo = wojewodzctwo;
	}

	public Set<AcademicThemeEnum> getThemesMatching() {
		return themesMatching;
	}

	public void setThemesMatching(Set<AcademicThemeEnum> themesMatching) {
		this.themesMatching = themesMatching;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + 17 * wojewodzctwo.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + wojewodzctwo.getName();
	}
}

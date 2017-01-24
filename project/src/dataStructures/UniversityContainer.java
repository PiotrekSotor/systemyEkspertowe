package dataStructures;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniversityContainer {
	List<University> universityList;
	Path uczelnieFilePath = FileSystems.getDefault().getPath("./data", "uczelnie.txt");

	public UniversityContainer(WojewodzctwoContainer wojContainer) {
		readFromFiles(wojContainer);
	}

	private void readFromFiles(WojewodzctwoContainer wojContainer) {
		// TODO Auto-generated method stub
		universityList = new ArrayList<>();

		try {
			List<String> lines = Files.readAllLines(uczelnieFilePath, Charset.defaultCharset());
			for (String line : lines) {
				List<String> tokens = Arrays.asList(line.split(";"));
				University uni = new University();
				uni.setName(tokens.get(0).trim());
				uni.setWojewodzctwo(wojContainer.getWojewodztwoByCode(tokens.get(1).trim()));
				uni.setRating(Integer.parseInt(tokens.get(2).trim()));
				Set<AcademicThemeEnum> themes = new HashSet<>();
				for (int i = 3; i < 7; ++i) {
					String token = tokens.get(i).trim();
					if (!token.equals("EEE")) {
						themes.add(AcademicThemeEnum.getByCode(token));
					}
				}
				uni.setThemesMatching(themes);
				universityList.add(uni);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		universityList.stream().forEach(p -> {
			sb.append(p.toString());
			sb.append("\n");
		});
		return sb.toString();
	}

	public List<University> getList() {
		return universityList;
	}
}

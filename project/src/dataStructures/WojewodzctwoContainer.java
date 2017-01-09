package dataStructures;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WojewodzctwoContainer {
	List<Wojewodzctwo> wojewodzctwaList;
	Path wojewodztwaFilePath = FileSystems.getDefault().getPath("./data", "wojewodztwa.txt");
	Path neighboursFilePath = FileSystems.getDefault().getPath("./data", "sasiedztwa.txt");

	public WojewodzctwoContainer() {
		readFromFiles();
	}

	private void readFromFiles() {
		// TODO Auto-generated method stub
		wojewodzctwaList = new ArrayList<>();

		try {
			List<String> lines = Files.readAllLines(wojewodztwaFilePath, Charset.defaultCharset());
			for (String line : lines) {
				List<String> tokens = Arrays.asList(line.split(";"));
				Wojewodzctwo newWoj = new Wojewodzctwo();
				newWoj.setName(tokens.get(0));
				newWoj.setCode(tokens.get(1));
				wojewodzctwaList.add(newWoj);
			}

			lines = Files.readAllLines(neighboursFilePath);
			for (String line : lines) {
				List<String> tokens = Arrays.asList(line.split(";"));
				Wojewodzctwo foundWoj = getWojewodztwoByCode(tokens.get(0));
				ArrayList<Wojewodzctwo> neighbours = new ArrayList<>();
				for (int i = 0; i < tokens.size(); ++i) {
					neighbours.add(getWojewodztwoByCode(tokens.get(i)));
				}
				foundWoj.setNeighbours(neighbours);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		wojewodzctwaList.stream().forEach(p -> {
			sb.append(p.toString());
			sb.append(" -> ");
			p.getNeighbours().stream().forEach(q -> sb.append(q.getName() + " "));
			sb.append("\n");
		});
		return sb.toString();
	}

	public Wojewodzctwo getWojewodztwoByCode(String code) {
		return wojewodzctwaList.stream().filter(p -> p.getCode().equals(code)).collect(Collectors.toList()).get(0);
	}

}

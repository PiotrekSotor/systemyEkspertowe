package dataStructures;

import java.util.List;

public class Wojewodzctwo {
	private String name;
	private String code;
	private List<Wojewodzctwo> neighbours;

	public Wojewodzctwo() {
	}

	@Override
	public String toString() {
		return name;
	}

	public List<Wojewodzctwo> getNeighbours() {
		return neighbours;
	}

	public void setNeighbours(List<Wojewodzctwo> neighbours) {
		this.neighbours = neighbours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Wojewodzctwo) {
			return name.equals(((Wojewodzctwo) obj).getName()) && code.equals(((Wojewodzctwo) obj).getCode());
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 7 * code.hashCode() + 17 * name.hashCode() + 11 * neighbours.get(0).hashCode()
				+ 23 * neighbours.get(1).hashCode() + 31 * neighbours.get(2).hashCode();
	}

}

package dataStructures;

public enum Distance {
	CLOSE("blisko"), FAR("daleko"), MID("�rednio");

	private String name;

	private Distance(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}

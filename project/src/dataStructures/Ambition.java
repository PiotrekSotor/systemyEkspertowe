package dataStructures;

public enum Ambition {
	LOW("niska", 1), MID("œrednia", 2), HIGH("wysoka", 3);
	private String name;
	private Integer order;

	private Ambition(String name, Integer order) {
		this.name = name;
		this.order = order;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	public Integer getOrder() {
		return this.order;
	}
}

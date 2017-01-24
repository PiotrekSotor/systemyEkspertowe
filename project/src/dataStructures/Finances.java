package dataStructures;

public enum Finances {
	BIEDNY("biedny", 1), UBOGI("ubogi", 2), SREDNI("œredni", 3), ZAMOZNY("zamo¿ny", 4), BOGATY("bogaty", 5);

	private String name;
	private Integer order;

	private Finances(String name, Integer order) {
		this.name = name;
		this.order = order;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	public Integer getOrder() {
		return order;
	}
}

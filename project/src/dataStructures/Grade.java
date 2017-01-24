package dataStructures;

public enum Grade {
	JEDEN(1), DWA(2), TRZY(3), CZTERY(4), PIEC(5), SZESC(6);
	Integer grade;

	private Grade(Integer grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return grade.toString();
	}

}

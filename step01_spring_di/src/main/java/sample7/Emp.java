package sample7;

public class Emp {
	private String name;
	private int salary;
	
	public Emp() {
		
	}

	public Emp(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "이름 : " + name + "\t급여 : " + salary + "원\t";
	}
	
}

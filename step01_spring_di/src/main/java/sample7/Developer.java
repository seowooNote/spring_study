package sample7;

public class Developer extends Emp {
	private Emp emp;
	private String dept;
	
	public Developer() {
		super();
	}

	public Developer(Emp emp, String dept) {
		super();
		this.emp=emp;
		this.dept=dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp.toString() + "부서 : " + dept + "(개발부)";
	}
}

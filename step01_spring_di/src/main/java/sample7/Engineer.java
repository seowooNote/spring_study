package sample7;

public class Engineer extends Emp {
	private Emp emp;
	private String dept;

	public Engineer() {
		super();
	}

	public Engineer(Emp emp, String dept) {
		super();
		this.emp = emp;
		this.dept = dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp.toString() + "부서 : " + dept + "(기술부)";
	}
	
	
	
	
	
}

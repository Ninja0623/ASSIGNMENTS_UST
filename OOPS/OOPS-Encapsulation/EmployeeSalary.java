package encapsulation;

public class EmployeeSalary {
	
	private long empid;
	private int salary;
	
	public long getEmpid() {
		return empid;
	}
	
	public void setEmpid(long empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary>0)
			this.salary = salary;
	}

	public void displaySalary()
	{
		System.out.println("Salary : "+salary);
	}
	
	public static void main(String[] args) {
		EmployeeSalary e=new EmployeeSalary();
		e.setEmpid(2);
		e.setSalary(35000);
		e.displaySalary();
	}

}

package encapsulation;

public class Customer {

	private String name;
	private int age;
	

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if(age>=18)
			this.age = age;
	}
	
	public String getDetails()
	{
		return name+" "+age;
	}

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setAge(18);
		c.setName("Raj");
		System.out.println(c.getDetails());

	}

}

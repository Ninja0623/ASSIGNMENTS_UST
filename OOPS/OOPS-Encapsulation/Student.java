package encapsulation;

public class Student {
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String args[])
	{
		Student s=new Student();
		s.setId(01);
		s.setName("Ashwin");
		System.out.println("Name : "+s.getName());
		System.out.println("ID : "+s.getId());
	}
	
}

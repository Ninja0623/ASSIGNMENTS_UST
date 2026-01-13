package encapsulation;

public class College {
	
	private int mark;
	private char grade;
	
	public void setMark(int mark)
	{
		this.mark=mark;
		
		if(mark>=90)
			grade='A';
		else if(mark>=75)
			grade='B';
		else if(mark>=50)
			grade='C';
		else
			grade='F';
	}
	
	public char getGrade() {
		return grade;
	}

	public static void main(String[] args) {
		College c =new College();
		c.setMark(89);
		System.out.println(c.getGrade());		
	}

}

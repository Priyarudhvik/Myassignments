package week3.day1;

;

public class College1 extends Student1 {
	public void Dept() {
		super.Department1();
		System.out.println("The student is from ECE");
	}
	
	public static void main(String[] args) {
		College1 clg=new College1();
		clg.StudentId(21);
		clg.EmailId("pooja@gmail.com");
		clg.Name("priya");
		clg.number(22484096l);
		clg.Dept();
	
		
	}
		
		
	

}

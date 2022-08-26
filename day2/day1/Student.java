package week3.day1;

public class Student extends Department {
	public void StudentName() {
		System.out.println("Shanmugapriya");
	}
public void StudentId() {
	System.out.println("33");
}
public void StudentDept() {
	System.out.println("ECE");
}
public static void main(String[] args) {
	Student st=new Student();
	st.CollegeCode();
	st.CollegeName();
	st.CollegeRank();
	st.DepartmentName();
	st.StudentDept();
	st.StudentId();
	st.StudentName();
}
}


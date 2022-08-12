package week1.day2;

public class Negativetopositive {
	public static void main(String[] args) {
		int num=-90;
		int posnum;
		if(num<0) {
			posnum=num*-1;
			System.out.println("the converted postive number is" +posnum);
		}
		else {
			System.out.println("The given no is positive");
		}
	}

}

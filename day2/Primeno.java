package week1.day2;

public class Primeno {
	
	public static void main(String[] args) {
		int num=13;
		boolean flag=true;
		
	if (num==1 ||num==0){
			System.out.println("The given number is not a prime number");
			
		}
		else 
		for (int i=2;i<num;i++)
			if (num%i==0) {
				System.out.println("the given number is not a prime number");
				flag=false;
			break;
				
			}
		if(flag==true)
		{
			System.out.println("The given number is a prime number");
		
		}

	}

}

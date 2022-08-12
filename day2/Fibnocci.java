package week1.day2;



public class Fibnocci {
public static void main(String[] args) {
	int n1=0,n2=1;
	int sum;
	int range=8;
	
	for (int i=0;i<=range;i++)
	{
		System.out.println(n1);
		sum=n1+n2;
		n1=n2;
		n2=sum;
		
	}
	
}

}

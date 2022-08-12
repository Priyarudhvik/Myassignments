package week1.day2;

public class Palindrome {
public static void main(String[] args) {
	int num=343;
	int a=num;
int temp=0;
	int n;
	for(int i=1;num>0;i++) {
		n=num%10;
		temp=(temp*10)+n;
		num=num/10;
		}
	
		if(a==temp) 
		System.out.println("the given number is a palindrome");
		
		else 
			System.out.println("the number is not palindrome");
	
	}
}


